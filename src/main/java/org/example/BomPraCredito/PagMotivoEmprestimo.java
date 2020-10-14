package org.example.BomPraCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.WebDriverAcoes.getDriver;

public class PagMotivoEmprestimo{

    private PagHomePage homePage;

    private WebElement btnOutrosMotivos;

    public void escolherMotivo() {

        btnOutrosMotivos = getDriver().findElement(By.xpath("//span[text()='Outro ']"));

        btnOutrosMotivos.click();
    }

    public  boolean aguardar() {
       homePage = new PagHomePage();
        return homePage.aguardar();
    }
}
