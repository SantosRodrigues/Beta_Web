package org.example.Hook;

import org.example.WebDriverAcoes;
import org.junit.After;
import org.junit.Before;

public class Hook extends WebDriverAcoes {

        private WebDriverAcoes driverAcoes = new WebDriverAcoes();

        @Before
        public void Before(){
            driverAcoes.iniciarNavegador("chrome");

        }
        @After
        public void After(){
            getDriver().quit();
        }
    }


