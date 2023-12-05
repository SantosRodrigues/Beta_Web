package santos.higor.utils;

import io.cucumber.java.Scenario;
import lombok.Getter;
import lombok.Setter;

public class GerenciadorDeScenario {

    @Getter @Setter
    private static Scenario scenario;

    private GerenciadorDeScenario (){
        throw new IllegalStateException("Utility class");
    }
}
