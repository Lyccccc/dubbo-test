package net.coderchen.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Liuyuchen on 2017/12/25.
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.in.read();
    }
}
