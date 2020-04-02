package com.example.springioc.demo.config;


import com.example.springioc.demo.Bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    public Person getPerson(){
        Person person = new Person();
        person.setAge(1);
        person.setName("dream");
        return person;
    }
}
