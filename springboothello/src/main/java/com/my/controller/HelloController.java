package com.my.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @RestController 等价于(@Controller 和 @RequestBody)
 * Created by pc on 2017/7/4.
 */
@RestController
public class HelloController
{
    /**
     * @RequestMapping建立请求映射
     * @return
     */
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello";
    }
}
