package com.example.compario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.compario.repositories")
public class ComparioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComparioApplication.class, args);
    }

}
