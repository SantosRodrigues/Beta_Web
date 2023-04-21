package santos.higor.properties;

import santos.higor.enums.Parametros;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DefinitionsProperties {

    private DefinitionsProperties() {
        throw new IllegalStateException("Utility class");
    }

    private static Properties getDefinitions() {
        Properties props = new Properties();
        try (FileInputStream file = new FileInputStream(".\\src\\test\\resources\\definitions.properties")) {
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }

    public static String getParametro(Parametros parametro) {
        String textoEnum = parametro.getParametro();
        String vmoptions = System.getProperty(textoEnum);
        String propriedade = getDefinitions().getProperty(textoEnum);

        if (vmoptions == null || vmoptions.isEmpty()){
            if(propriedade == null || propriedade.isEmpty()){
                throw new IllegalArgumentException(String.format("Informe o valor do parâmetro [%s] corretamente.", textoEnum));
            }
            return getDefinitions().getProperty(textoEnum);
        }
        return vmoptions;
    }


}