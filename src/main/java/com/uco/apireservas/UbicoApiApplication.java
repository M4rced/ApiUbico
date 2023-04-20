package com.uco.apireservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class UbicoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbicoApiApplication.class, args);
    }

}
