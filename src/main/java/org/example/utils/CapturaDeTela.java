package org.example.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static org.example.properties.DefinitionsProperties.getProp;

public class CapturaDeTela {

    private CapturaDeTela() {
        throw new IllegalStateException("Utility class");
    }

    public static void capturarTela(String nomeDaEtapa, WebDriver webDriver, Scenario scenario) {
        String pathDiretorio = getProp().getProperty("prop.path.screenShot") + scenario.getName() + "\\";
        String nomeDoArquivo = LocalDateTime.now().toString().replace(":", "-") + " - " + nomeDaEtapa;
        final String extensao = ".png";

        if (getProp().getProperty("prop.screenShot").equalsIgnoreCase("true")) {

            File capturaDeTela = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(capturaDeTela, new File(pathDiretorio + nomeDoArquivo + extensao));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void limparDiretorioDeCapturaDeTela() {

        if (getProp().getProperty("prop.cleanScreenShot").equalsIgnoreCase("true")) {

            File pasta = new File(getProp().getProperty("prop.path.screenShot"));

            try {
                FileUtils.deleteDirectory(pasta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
