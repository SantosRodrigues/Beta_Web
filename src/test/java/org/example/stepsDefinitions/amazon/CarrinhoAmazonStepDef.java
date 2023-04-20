package org.example.stepsDefinitions.amazon;

import io.cucumber.java.pt.Entao;
import org.example.utils.CapturaDeTela;
import org.junit.Assert;

import static org.example.hook.Hook.scenario;
import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class CarrinhoAmazonStepDef {

    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Entao("validar que produto foi adicionado ao carrinho com sucesso")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso() {
        Assert.assertEquals("Adicionado ao carrinho", pagAmazonPerfilProdutoPO.validarProdutoAdicionadoAoCarrinhoComSucesso());
        CapturaDeTela.capturarTela("Produto adicionado ao carrinho", getDriver(), scenario);
    }
}