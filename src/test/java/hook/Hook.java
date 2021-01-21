package hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.WebDriverAcoes;

public class Hook extends WebDriverAcoes {



        @Before
        public void Before(){
            iniciarNavegador("chrome");
        }

        @After
        public void After(){
            getDriver().quit();
        }
    }


