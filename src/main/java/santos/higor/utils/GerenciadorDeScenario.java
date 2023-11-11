package santos.higor.utils;

import io.cucumber.java.Scenario;

public class GerenciadorDeScenario {

    public GerenciadorDeScenario (){
        throw new IllegalStateException("Utility class");
    }

    private static Scenario scenario;

    public static void setScenario(Scenario scenario) {
        GerenciadorDeScenario.scenario = scenario;
    }

    public static Scenario getScenario() {
        return scenario;
    }
}
