package com.chj.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EchoProvider {
    public static void main(String[] argc)throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"spring/echo-provider.xml"});
        context.start();
        System.in.read();
    }
}
