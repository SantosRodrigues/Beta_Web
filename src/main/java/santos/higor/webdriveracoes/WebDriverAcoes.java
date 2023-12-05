package santos.higor.webdriveracoes;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;

import java.util.function.Supplier;
public class WebDriverAcoes {

    @Getter @Setter
    private static Exception webDriverException;

    private WebDriverAcoes(){
        throw new IllegalStateException("Utility class");
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
