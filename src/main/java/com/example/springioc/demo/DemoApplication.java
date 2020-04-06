package com.example.springioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    //testgit
    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(DemoApplication.class, args);
      SpringContextUtils.setApplicationContext(context);
    }

}
