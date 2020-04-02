package com.example.springioc.demo.Bean;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Data
public class Person {
    private String name;

    private int age;

    public void add(){
        System.out.println("添加人员");
    }

}
