package santos.higor.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static santos.higor.enums.Parametros.*;
import static santos.higor.properties.VariavelDoSistema.getParametro;

public class CapturaDeTela {

    private CapturaDeTela() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Realiza a captura de tela e armazena na raiz do projeto.
     *
     * @param webDriver   driver que deseja realizar a captura de tela.
     * @param scenario    utilizado para obter a informação do nome da feature sendo executada no momento.
     * @param nomeDaEtapa nome da etapa para melhor descricao da captura de tela.
     */
    public static void capturarTela(WebDriver webDriver, Scenario scenario, String nomeDaEtapa) {
        String pathDiretorio = String.format(getParametro(PATH_CAPTURAR_TELA), scenario.getName());
        String nomeDoArquivo = LocalDateTime.now().toString().replace(":", "-") + " - " + nomeDaEtapa;
        final String extensao = ".png";

        if (Boolean.parseBoolean(getParametro(CAPUTRAR_TELA))) {
            File capturaDeTela = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(capturaDeTela, new File(pathDiretorio + nomeDoArquivo + extensao));
            } catch (IOException e) {
                LogManager.getLogger().info(e);
            }
        }
    }

    /**
     * Realiza a limpeza do diretório onde ficam armazenados as capturas de tela.
     */
    public static void limparDiretorioDeCapturaDeTela() {
        if (Boolean.parseBoolean(getParametro(LIMPAR_CAPTURAS_DE_TELA))) {
            File pasta = new File(getParametro(PATH_CAPTURAR_TELA).substring(0, 13));

            try {
                FileUtils.deleteDirectory(pasta);
            } catch (IOException e) {
                LogManager.getLogger().info(e);
            }
        }
    }
}
