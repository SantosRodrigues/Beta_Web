package santos.higor.validacoes;

import lombok.Getter;
import lombok.Setter;
import org.assertj.core.api.Assertions;

public class ValidacaoAssertJ {

    @Getter @Setter
    private static AssertionError exceptionAssertionError;

    public ValidacaoAssertJ() {
        exceptionAssertionError = null;
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
