package santos.higor.properties;

import santos.higor.enums.Parametros;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class VariavelDoSistema {

    private VariavelDoSistema() {
        throw new IllegalStateException("Utility class");
    }

    protected static Properties lerArquivoPropeties(String path) {
        Properties props = new Properties();
        try (FileInputStream file = new FileInputStream(path)) {
            props.load(file);
        } catch (IOException ignored) {
            throw new IllegalArgumentException("Path informado é invalido.");
        }
        return props;
    }

    /**
     * Retorna os parametros informavos via VMOptions e definidos no arquivo "definitions.properties" respectivamente.
     * @param parametro Enum responsável por centralizar os possíveis parametros.
     * @return a informação atribuida ao parâmetro.
     */
    public static String getParametro(Parametros parametro) {
        String textoEnum = parametro.getParametro();
        String vmoptions = System.getProperty(textoEnum);
        String pathDefinitions = ".\\src\\test\\resources\\definitions.properties";
        String propriedade = lerArquivoPropeties(pathDefinitions).getProperty(textoEnum);

        if (vmoptions == null || vmoptions.isEmpty()){
            if(propriedade == null || propriedade.isEmpty()){
                throw new IllegalArgumentException(String.format("Informe o valor do parâmetro [%s] corretamente.", textoEnum));
            }
            return lerArquivoPropeties(pathDefinitions).getProperty(textoEnum);
        }
        return vmoptions;
    }

    public String teste(){
        return "azul";
    }
}