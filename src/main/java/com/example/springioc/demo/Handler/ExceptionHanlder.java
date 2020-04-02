package com.example.springioc.demo.Handler;

import com.example.springioc.demo.Exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHanlder {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }

    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myErrorhandler(MyException ex){
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }


}
