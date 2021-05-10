package org.example.amazon;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static org.example.webDriverAcoes.WebDriverAcoes.getDriver;

public class PagAmazonResultadoPesquisaPO {

    private int indicador;

    public boolean resgatarNomeDoProduto(String produto) {

        List<String> titulos = new ArrayList<>();

        for(indicador =1; indicador <=48; indicador++) {
            titulos.add(getDriver().findElement((By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[position()=" + indicador + "]"))).getText());
        }

        titulos.replaceAll(String::toLowerCase);

        for (String str : titulos) {
            if (str.trim().contains(produto.toLowerCase())) {
                System.out.print(str.trim());
                return true;
            }
        }
        return false;
    }
}


