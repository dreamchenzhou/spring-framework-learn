package com.example.springioc.demo;

import lombok.Data;
import org.springframework.context.ApplicationContext;

@Data
public class SpringContextUtils {

    private static ApplicationContext mContext;


    public static void setApplicationContext(ApplicationContext context){
        mContext = context;
    }

    public static ApplicationContext getApplicationContext(){

        if(mContext==null){
            throw new NullPointerException("spring 上下文不能为空!");
        }
        return mContext;
    }

    public static Object getBean(Class t){
        return mContext.getBean(t);
    }

    public static Object getBean(String beanName){
        return mContext.getBean(beanName);
    }
}
