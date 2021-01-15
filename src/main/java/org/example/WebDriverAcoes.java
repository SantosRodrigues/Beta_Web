package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAcoes {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static WebDriver driver4Devs;
    private static WebDriverWait wait4Devs;

    public void iniciarNavegador(String navegador) {
        switch (navegador) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Higor\\Downloads\\geckodriver-win64\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Higor\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                System.err.println("Opção incorreta, escolha entre 'chrome' e 'firefox'.");
        }
        driver.manage().window().maximize();
        driver.get("https://bompracredito.com.br");
        wait = new WebDriverWait(driver, 30);
    }


    public static void abrirPagina4devsCPF(){
        driver4Devs = new ChromeDriver();
        driver4Devs.manage().window().maximize();
        driver4Devs.get("https://www.4devs.com.br/gerador_de_cpf");
        wait4Devs = new WebDriverWait(driver4Devs,30);
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
