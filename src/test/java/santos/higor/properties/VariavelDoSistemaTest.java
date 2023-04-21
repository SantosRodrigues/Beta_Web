package santos.higor.properties;

import org.junit.Assert;
import org.junit.Test;

import static santos.higor.enums.Parametros.ERROR;
import static santos.higor.properties.VariavelDoSistema.getParametro;
import static santos.higor.properties.VariavelDoSistema.lerArquivoPropeties;


public class VariavelDoSistemaTest {

    @Test
    public void informarPathInvalidoAoPegarArquivoPropeties() {
        String mensagem = "";
        //DADO
        try {
            lerArquivoPropeties("");
        } catch (IllegalArgumentException e) {
            mensagem = e.toString();
        }
        //ENTAO
        Assert.assertEquals("java.lang.IllegalArgumentException: Path informado é invalido.", mensagem);
    }

    @Test
    public void informarVMOptionsEArquivoPropertiesInvalidos() {
        String mensagem = "";
        //DADO
        try {
            getParametro(ERROR);
        } catch (IllegalArgumentException e) {
            mensagem = e.getMessage();
        }
        //ENTAO
        Assert.assertEquals("Informe o valor do parâmetro [prop.error] corretamente.", mensagem);
    }
}
