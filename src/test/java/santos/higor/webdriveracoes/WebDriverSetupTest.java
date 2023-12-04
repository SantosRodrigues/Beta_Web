package santos.higor.webdriveracoes;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static santos.higor.enums.Parametros.HEADLESS;
import static santos.higor.enums.Parametros.NAVEGADOR;
import static santos.higor.webdriveracoes.WebDriverSetup.*;

public class WebDriverSetupTest {

    @Test
    public void criarNavegadorFirefoxComSuscesso() {
        System.setProperty(HEADLESS.getParametro(), "true");
        //DADO
        System.setProperty(NAVEGADOR.getParametro(), "firefox");
        iniciarNavegador();
        //QUANDO
        WebDriver webDriver = getDriver();
        //ENTAO
        Assert.assertNotNull(webDriver);
        System.clearProperty(HEADLESS.getParametro());
        System.clearProperty(NAVEGADOR.getParametro());
        webDriver.quit();
    }

    @Test
    public void criarNavegadorChromeComSuscesso() {
        System.setProperty(HEADLESS.getParametro(), "true");
        //DADO
        System.setProperty(NAVEGADOR.getParametro(), "chrome");
        iniciarNavegador();
        //QUANDO
        WebDriver webDriver = getDriver();
        //ENTAO
        Assert.assertNotNull(webDriver);
        System.clearProperty(HEADLESS.getParametro());
        System.clearProperty(NAVEGADOR.getParametro());
        webDriver.quit();
    }

    @Test
    public void informarNavegadorInvalido() {
        String mensagem = "";
        //DADO
        System.setProperty(NAVEGADOR.getParametro(), "navegador");
        //QUANDO
        try {
            iniciarNavegador();
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }
        //ENTAO
        Assert.assertEquals("Opção incorreta, escolha entre 'chrome' e 'firefox'.", mensagem);
        System.clearProperty(NAVEGADOR.getParametro());
    }

    @Test
    public void criarWebDriverWaitComSucesso(){
        System.setProperty(HEADLESS.getParametro(), "true");
        //DADO
        iniciarNavegador();
        //QUANDO
        WebDriverWait webDriverWait = getWait();
        //ENTAO
        Assert.assertNotNull(webDriverWait);
        System.clearProperty(HEADLESS.getParametro());
        getDriver().quit();
    }
}
