package santos.higor.stepsDefinitions.amazon;

import io.cucumber.java.pt.Entao;
import santos.higor.utils.CapturaDeTela;
import org.junit.Assert;
import santos.higor.webDriverAcoes.WebDriverAcoes;

import static santos.higor.hook.Hook.scenario;

public class CarrinhoAmazonStepDef {

    private final PagAmazonPerfilProdutoPO pagAmazonPerfilProdutoPO = new PagAmazonPerfilProdutoPO();

    @Entao("validar que produto foi adicionado ao carrinho com sucesso")
    public void validar_que_produto_foi_adicionado_ao_carrinho_com_sucesso() {
        Assert.assertEquals("Adicionado ao carrinho", pagAmazonPerfilProdutoPO.validarProdutoAdicionadoAoCarrinhoComSucesso());
        CapturaDeTela.capturarTela("Produto adicionado ao carrinho", WebDriverAcoes.getDriver(), scenario);
    }
}