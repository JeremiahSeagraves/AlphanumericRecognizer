package com.jeremiahseagraves.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AlphanumericRecognizerApp {

    public static void main(String[] args) {
        SpringApplication.run(AlphanumericRecognizerApp.class, args);
    }

}
