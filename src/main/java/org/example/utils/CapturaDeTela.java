package org.example.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static org.example.properties.DefinitionsProperties.getProp;

public class CapturaDeTela {

    public static void capturarTela(String nomeDaEtapa, WebDriver webDriver) {

        if (getProp().getProperty("prop.screenShot").equalsIgnoreCase("true")) {

            TakesScreenshot captura = (TakesScreenshot) webDriver;
            LocalDateTime dataHora = LocalDateTime.now();
            File caminhoOrigemCaptura = captura.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(caminhoOrigemCaptura, new File(getProp().getProperty("prop.path.screenShot") + dataHora.toString().replaceAll(":", "-") + " - " + nomeDaEtapa + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void limparDiretorioDeCapturaDeTela() {

        if (getProp().getProperty("prop.cleanScreenShot").equalsIgnoreCase("true")) {

            File pasta = new File(getProp().getProperty("prop.path.screenShot"));
            File[] arquivos = pasta.listFiles();

            for (File arquivo : arquivos) {
                if (arquivo.getName().endsWith("png")) {
                    arquivo.delete();
                }
            }
        }
    }
}
