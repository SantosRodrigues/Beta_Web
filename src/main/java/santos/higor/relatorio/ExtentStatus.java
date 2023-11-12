package santos.higor.relatorio;

import com.aventstack.extentreports.Status;

public class ExtentStatus {

    private ExtentStatus () {
        throw new IllegalStateException("Utility class");
    }

    public static Status getStatus(io.cucumber.java.Status status) {

        switch (status) {
            case PASSED: return Status.PASS;
            case FAILED: return Status.FAIL;
            case SKIPPED: return Status.SKIP;
            default :
                throw new IllegalArgumentException("Não foi encontrado um status correspondente");
        }
    }
}
