package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAcoes {
    private static WebDriver driver;
    private static WebDriverWait wait;


    public void inicalizarDriverChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Higor\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bompracredito.com.br");
        wait = new WebDriverWait(driver, 30);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriverWait getWait(){
        return wait;
    }

}
