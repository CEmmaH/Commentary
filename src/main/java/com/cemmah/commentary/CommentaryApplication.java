package com.cemmah.commentary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CommentaryApplication is the main entry point for the Spring Boot application.
 * This class contains the main method which is used to launch the application.
 * <p>It is annotated with @SpringBootApplication, which enables auto-configuration,
 * component scanning, and allows defining extra configurations for the application.
 *
 * Author：Emma
 * Date：11/6/2024
 * Version: 1.0
 */
@SpringBootApplication
public class CommentaryApplication {
    public static void main(String[] args){
        SpringApplication.run(CommentaryApplication.class, args);
    }
}
