package org.example.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DefinitionsProperties {

    public static Properties getProp() {

        Properties props = new Properties();
        FileInputStream file;
        try {
            file = new FileInputStream("C:\\Users\\Higor\\IdeaProjects\\ProjetosBetaGitlab\\beta_web\\src\\test\\resources\\definitions.properties");
            props.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;

    }
}