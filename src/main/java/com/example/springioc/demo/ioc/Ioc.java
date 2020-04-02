package com.example.springioc.demo.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ioc {
    ApplicationContext xmlContenxt = new FileSystemXmlApplicationContext("");
    ApplicationContext clazzContext = new ClassPathXmlApplicationContext("");
}
