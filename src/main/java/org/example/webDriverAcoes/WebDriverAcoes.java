package org.example.webDriverAcoes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.example.properties.DefinitionsProperties.getProp;

public class WebDriverAcoes {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static WebDriver driver4Devs;
    private static WebDriverWait wait4Devs;

    public void iniciarNavegador() {
        switch (getProp().getProperty("prop.navigator")) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", getProp().get("prop.path.driver") + "geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", getProp().getProperty("prop.path.driver") + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                System.err.println("Opção incorreta, escolha entre 'chrome' e 'firefox'.");
        }
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 30);
    }

    public void abrirPagina4devsCPF() {
        if(getProp().getProperty("prop.navigator").equalsIgnoreCase("chrome")){
            driver4Devs = new ChromeDriver();
        }else if(getProp().getProperty("prop.navigator").equalsIgnoreCase("firefox")){
            driver4Devs = new FirefoxDriver();
        }
        driver4Devs.get(getProp().getProperty("prop.url.4devs.cpf"));
        driver4Devs.manage().window().maximize();
        wait4Devs = new WebDriverWait(driver4Devs, 30);
    }

    public static WebDriver getDriver() {
        return driver;
    }
    public static WebDriverWait getWait() {
        return wait;
    }
    public static WebDriver getDriver4Devs() {
        return driver4Devs;
    }
    public static WebDriverWait getWait4Devs() {
        return wait4Devs;
    }

}