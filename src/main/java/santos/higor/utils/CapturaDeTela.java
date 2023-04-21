package santos.higor.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static santos.higor.enums.Parametros.*;
import static santos.higor.properties.DefinitionsProperties.getParametro;

public class CapturaDeTela {

    private CapturaDeTela() {
        throw new IllegalStateException("Utility class");
    }

    public static void capturarTela(String nomeDaEtapa, WebDriver webDriver, Scenario scenario) {
        String pathDiretorio = getParametro(PATH_CAPTURAR_TELA) + scenario.getName() + "\\";
        String nomeDoArquivo = LocalDateTime.now().toString().replace(":", "-") + " - " + nomeDaEtapa;
        final String extensao = ".png";

        if (Boolean.parseBoolean(getParametro(CAPUTRAR_TELA))) {
            File capturaDeTela = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(capturaDeTela, new File(pathDiretorio + nomeDoArquivo + extensao));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void limparDiretorioDeCapturaDeTela() {
        if (Boolean.parseBoolean(getParametro(LIMPAR_CAPTURAS_DE_TELA))) {
            File pasta = new File(getParametro(PATH_CAPTURAR_TELA));

            try {
                FileUtils.deleteDirectory(pasta);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
