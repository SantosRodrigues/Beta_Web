package org.example.stepsDefinitions.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;
import static org.example.webDriverAcoes.WebDriverAcoes.getWait;

public class PagAmazonPerfilProdutoPO {

    public PagAmazonPerfilProdutoPO(){
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(css = "#add-to-cart-button")
    private WebElement btnAdicionarCarrinho;
    @FindBy(css = ".a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold")
    private WebElement txtProdutoAdicionadoAoCarrinhoComSucesso;

    public void adicionarProdutoAoCarrinho(){
        getWait().until(ExpectedConditions.elementToBeClickable(btnAdicionarCarrinho));
        btnAdicionarCarrinho.click();
    }

    public boolean validarProdutoAdicionadoAoCarrinhoComSucesso(){
        getWait().until(ExpectedConditions.visibilityOf(txtProdutoAdicionadoAoCarrinhoComSucesso));
        return txtProdutoAdicionadoAoCarrinhoComSucesso.getText().equalsIgnoreCase("Adicionado ao carrinho");
    }
}
