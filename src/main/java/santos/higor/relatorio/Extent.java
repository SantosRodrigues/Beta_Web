package santos.higor.relatorio;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class Extent {

    private static  ExtentReports extentInstance;
    private static ExtentSparkReporter sparkInstance;
    private static ExtentTest testeAtualEmExecucao;

    private Extent() {
        throw new IllegalStateException("Utility class");
    }

    public static ExtentReports getExtentInstance() {
        return extentInstance;
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

    public static ExtentSparkReporter getSparkInstance(){
        return sparkInstance;
    }

    public static void setTesteAtualEmExecucao(ExtentTest testeAtualEmExecucao) {
        Extent.testeAtualEmExecucao = testeAtualEmExecucao;
    }

    public static ExtentTest getTesteAtualEmExecucao() {
        return testeAtualEmExecucao;
    }
}
