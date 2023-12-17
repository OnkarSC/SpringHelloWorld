package com.qsp.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration  //enable tomcat configuration
@SpringBootApplication
@ComponentScan
public class StaterApp {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(StaterApp.class);
        springApplication.run("9090");
    }
}
