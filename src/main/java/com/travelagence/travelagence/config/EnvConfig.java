package com.travelagence.travelagence.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    static {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(".env"));
            props.forEach((key, value) -> System.setProperty(key.toString(), value.toString()));
            System.out.println(".env chargé avec succès !");
        } catch (IOException e) {
            System.err.println("Impossible de charger le fichier .env : " + e.getMessage());
        }
    }
}
