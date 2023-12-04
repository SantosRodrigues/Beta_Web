package santos.higor.validacoes;

import org.assertj.core.api.Assertions;

public class ValidacaoAssertJ {

    private static AssertionError exceptionAssertionError;

    public ValidacaoAssertJ() {
        exceptionAssertionError = null;
    }

    public static AssertionError getExceptionAssertionError() {
        return exceptionAssertionError;
    }

    public static void setExceptionAssertionError(AssertionError exceptionAssertionError) {
        ValidacaoAssertJ.exceptionAssertionError = exceptionAssertionError;
    }

    /**
     * Realizar validação de igualdade de texto sem ignoreCase.
     * @param esperado texto esperado
     * @param retornado texto obtido
     */
    public void validoQueTextoEIgual(String esperado, String retornado) {
        try {
            Assertions.assertThat(retornado).as("Igualdade de texto")
                    .withFailMessage(String.join(" ", "Esperava:", esperado, "| Retornou:", retornado))
                    .isEqualTo(esperado);
        } catch (AssertionError e) {
            exceptionAssertionError = e;
            throw e;
        }
    }

    /**
     * Realizar validação de verdadeiro ou falso, esperassse que o campo passado seja true.
     * @param retornado esperasse que seja true
     */
    public void validoQueSejaVerdadeiro(boolean retornado) {
        try {
            Assertions.assertThat(retornado).as("Seja verdadeiro")
                    .withFailMessage(String.join(" ", "Esperava:", "true", "| Retornou:", String.valueOf(retornado)))
                    .isTrue();
        } catch (AssertionError e) {
            exceptionAssertionError = e;
            throw e;
        }
    }


}
