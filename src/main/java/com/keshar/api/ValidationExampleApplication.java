package com.keshar.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Validation API", version = "2.0", description = "Validation Microservice"))
public class ValidationExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationExampleApplication.class, args);
    }

}
