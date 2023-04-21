package santos.higor.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import santos.higor.properties.DefinitionsProperties;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class CapturaDeTela {

    private CapturaDeTela() {
        throw new IllegalStateException("Utility class");
    }

    public static void capturarTela(String nomeDaEtapa, WebDriver webDriver, Scenario scenario) {
        String pathDiretorio = DefinitionsProperties.getProp().getProperty("prop.path.screenShot") + scenario.getName() + "\\";
        String nomeDoArquivo = LocalDateTime.now().toString().replace(":", "-") + " - " + nomeDaEtapa;
        final String extensao = ".png";

        if (DefinitionsProperties.getProp().getProperty("prop.screenShot").equalsIgnoreCase("true")) {

            File capturaDeTela = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(capturaDeTela, new File(pathDiretorio + nomeDoArquivo + extensao));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void limparDiretorioDeCapturaDeTela() {

        if (DefinitionsProperties.getProp().getProperty("prop.cleanScreenShot").equalsIgnoreCase("true")) {

            File pasta = new File(DefinitionsProperties.getProp().getProperty("prop.path.screenShot"));

            try {
                FileUtils.deleteDirectory(pasta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
