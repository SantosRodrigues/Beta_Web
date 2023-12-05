package santos.higor.relatorio;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import lombok.Getter;
import lombok.Setter;

public class Extent {

    @Getter
    private static  ExtentReports extentInstance;
    @Getter
    private static ExtentSparkReporter sparkInstance;
    @Getter @Setter
    private static ExtentTest testeAtualEmExecucao;

    private Extent() {
        throw new IllegalStateException("Utility class");
    }

    public static void startExtent() {
        Extent.extentInstance = new ExtentReports();
    }

    /**
     * Configura a ordem de visualização das telas do relatório, transformando o dashboard como tela principal e
     * os testes secundária.
     */
    public static void startSpark() {
        Extent.sparkInstance = new ExtentSparkReporter("target/relatorio-extent.html").viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST})
                .apply();

    }
}
