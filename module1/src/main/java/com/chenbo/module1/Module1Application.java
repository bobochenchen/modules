package com.chenbo.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.chenbo"})
public class Module1Application {

    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);
    }

}
