package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在这里使用@SpringBootApplication, 指定这个是一个spring boot的一个应用程序
 * Created by pc on 2017/7/4.
 */
@SpringBootApplication
public class App
{
    public static void main(String[] args)
    {
        /*
         * 在main方法中进行启动App类的应用程序
         */
        SpringApplication.run(App.class, args);
    }
}
