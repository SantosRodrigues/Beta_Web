package santos.higor.webdriveracoes;

import org.openqa.selenium.WebElement;

import java.util.function.Supplier;

public class WebDriverAcoes {

    private static Exception webDriverException;

    public static Exception getWebDriverException() {
        return webDriverException;
    }

    public static void setWebDriverException(Exception webDriverException) {
        WebDriverAcoes.webDriverException = webDriverException;
    }

    /**
     * Acionara a condicao de espera do WebElement.
     * @param acao referencia do metodo passado que será executado.
     */
    public static void esperarWebDriverElement(Supplier<WebElement> acao) {
        try {
            acao.get();
        } catch (Exception e) {
            webDriverException = e;
            throw e;
        }
    }
}
