package santos.higor.enums;

public enum Parametros{

    /**
     * Enum [ERROR] criado para realizar teste unitário.
     */
    ERROR("prop.error"),
    EMPTY("prop.empty"),
    URL_AMAZON("prop.url.amazon"),
    PATH_CAPTURAR_TELA("prop.path.screenShot"),
    PATH_DRIVER_BASE("prop.path.driver"),
    LIMPAR_CAPTURAS_DE_TELA("prop.cleanScreenShot"),
    CAPUTRAR_TELA("prop.screenShot"),
    NAVEGADOR("prop.navigator"),
    HEADLESS("prop.headless");

    public final String parametro;

    Parametros(String parametro){
        this.parametro = parametro;
    }

    public String getParametro() {
        return parametro;
    }
}