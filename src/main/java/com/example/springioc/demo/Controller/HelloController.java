package com.example.springioc.demo.Controller;


import com.example.springioc.demo.Bean.Person;
import com.example.springioc.demo.Exception.MyException;
import com.example.springioc.demo.SpringContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/sayHello")
    public String hello(){
        Person person = (Person) SpringContextUtils.getBean(Person.class);
        String result =person.toString();
        return result;
    }

    @GetMapping("/getError")
    public void  getError() throws Exception {
        throw new Exception("报错啦");
    }

    @GetMapping("/getMyError")
    public void  getMyError() throws MyException {
        throw new MyException("404","wtf,404错误");
    }

}
