package santos.higor.webdriveracoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static santos.higor.enums.Parametros.*;
import static santos.higor.properties.VariavelDoSistema.getParametro;

public class WebDriverSetup {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private WebDriverSetup() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Realiza a inicialização do navegador.
     */
    public static void iniciarNavegador() {
        final boolean headless = Boolean.parseBoolean(getParametro(HEADLESS));
        final String pathDriver = getParametro(PATH_DRIVER_BASE);

        switch (getParametro(NAVEGADOR).toLowerCase()) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", pathDriver + "geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions().setHeadless(headless).setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                firefoxOptions.addArguments("--window-size=1920,1080");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", pathDriver + "chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions().setHeadless(headless);
                chromeOptions.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(chromeOptions);
                break;
            default:
                throw new IllegalArgumentException("Opção incorreta, escolha entre 'chrome' e 'firefox'.");
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }
}