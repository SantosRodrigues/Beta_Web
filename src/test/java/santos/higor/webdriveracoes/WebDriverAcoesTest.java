package santos.higor.webdriveracoes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static santos.higor.webdriveracoes.WebDriverAcoes.*;

public class WebDriverAcoesTest {

    @Test
    public void criarNavegadorComSuscesso() {
        //DADO
        iniciarNavegador();
        //QUANDO
        WebDriver webDriver = getDriver();
        //ENTAO
        Assert.assertNotNull(webDriver);
        webDriver.quit();
    }

    @Test
    public void informarNavegadorInvalido() {
        String mensagem = "";
        //DADO
        System.setProperty("prop.navigator", "navegador");
        //QUANDO
        try {
            iniciarNavegador();
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }
        //ENTAO
        Assert.assertEquals("Opção incorreta, escolha entre 'chrome' e 'firefox'.", mensagem);
        System.clearProperty("prop.navigator");
    }

    @Test
    public void criarWebDriverWaitComSucesso(){
        //DADO
        iniciarNavegador();
        //QUANDO
        WebDriverWait webDriverWait = getWait();
        //ENTAO
        Assert.assertNotNull(webDriverWait);
        getDriver().quit();
    }
}
