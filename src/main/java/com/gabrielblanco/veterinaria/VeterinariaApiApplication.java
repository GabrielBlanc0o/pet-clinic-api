package com.gabrielblanco.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(
    exclude = {DataSourceAutoConfiguration.class}
)
public class VeterinariaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeterinariaApiApplication.class, args);
    }
}
