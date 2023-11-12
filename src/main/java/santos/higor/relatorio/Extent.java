package santos.higor.relatorio;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

public class Extent {

    private static  ExtentReports extentInstance;
    private static ExtentSparkReporter spark;
    private static ExtentTest currentTest;

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
        Extent.spark = new ExtentSparkReporter("target/Spark.html").viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST})
                .apply();

    }

    public static ExtentSparkReporter getSpark(){
        return spark;
    }

    public static void setCurrentTest(ExtentTest currentTest) {
        Extent.currentTest = currentTest;
    }

    public static ExtentTest getCurrentTest() {
        return currentTest;
    }
}
