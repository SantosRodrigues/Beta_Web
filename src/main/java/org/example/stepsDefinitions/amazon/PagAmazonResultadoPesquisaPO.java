package org.example.stepsDefinitions.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class PagAmazonResultadoPesquisaPO {

    public PagAmazonResultadoPesquisaPO(){
        PageFactory.initElements(getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base'][position()=1]")
    private WebElement txtProdutoIndisponivel;
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base'][position()=2]")
    private WebElement txtProdutoIndisponivelNomeProduto;

    public boolean resgatarNomeDoProduto(String produto) {

        List<String> titulos = new ArrayList<>();

        for (int indicador = 1; indicador <= 48; indicador++) {
            titulos.add(getDriver().findElement((By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[position()=" + indicador + "]"))).getText());
        }

        titulos.replaceAll(String::toLowerCase);

        for (String str : titulos) {
            if (str.trim().contains(produto.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
    public String produtoNaoEncontrado(){
        txtProdutoIndisponivel.getText();
        txtProdutoIndisponivelNomeProduto.getText();
        return  txtProdutoIndisponivel.getText() + " " +txtProdutoIndisponivelNomeProduto.getText();
    }
}


