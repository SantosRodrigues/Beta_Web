package santos.higor.webDriverAcoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static santos.higor.properties.DefinitionsProperties.getProp;

public class WebDriverAcoes {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private WebDriverAcoes() {
        throw new IllegalStateException("Utility class");
    }

    public static void iniciarNavegador() {
        final String dimensoes = "--window-size=1920,1080";
        final String headless = getProp().getProperty("prop.headless");
        final String pathDriver = getProp().getProperty("prop.path.driver");

        switch (getProp().getProperty("prop.navigator")) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", pathDriver + "geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions().setHeadless(headless.equalsIgnoreCase("true"));
                driver = new FirefoxDriver(firefoxOptions.addArguments(dimensoes));
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", pathDriver + "chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions().setHeadless(headless.equalsIgnoreCase("true"));
                driver = new ChromeDriver(chromeOptions.addArguments(dimensoes));
                break;
            default:
                throw new IllegalArgumentException("Opção incorreta, escolha entre 'chrome' e 'firefox'.");
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }
}