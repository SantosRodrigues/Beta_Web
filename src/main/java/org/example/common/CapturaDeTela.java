package org.example.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static org.example.properties.DefinitionsProperties.getProp;

public class CapturaDeTela {

    public void capturarTela(String nomeDaEtapa, WebDriver webDriver) {

        if (getProp().getProperty("prop.screenShot").equals("true")) {

            TakesScreenshot captura = (TakesScreenshot) webDriver;
            LocalDateTime dataHora = LocalDateTime.now();

            File caminhoOrigemCaptura = captura.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(caminhoOrigemCaptura, new File("C:\\Users\\Higor\\Downloads\\CapturaSelenium\\" + dataHora.toString().replaceAll(":", "-") + " - " + nomeDaEtapa + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void limparDiretorio() {
        if (getProp().getProperty("prop.cleanScreenShot").equals("true")) {
            File pasta = new File("C:\\Users\\Higor\\Downloads\\CapturaSelenium");
            File[] arquivos = pasta.listFiles();

            for (File arquivo : arquivos) {
                if (arquivo.getName().endsWith("png")) {
                    arquivo.delete();
                }
            }

        }
    }
}
