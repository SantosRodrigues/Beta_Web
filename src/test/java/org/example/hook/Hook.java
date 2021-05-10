package org.example.hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.webDriverAcoes.WebDriverAcoes;

public class Hook extends WebDriverAcoes {

        @Before
        public void Before(){
            iniciarNavegador("chrome");
        }

        @After
        public void After(){
            getDriver().close();
        }
    }


