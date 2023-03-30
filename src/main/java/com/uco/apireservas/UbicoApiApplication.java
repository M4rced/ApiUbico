package com.uco.apireservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.uco.apireservas")
public class UbicoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbicoApiApplication.class, args);
    }

}
