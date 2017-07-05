package com.my.controller;

import com.my.entity.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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

    /**
     * 返回的JSON数据
     * @return
     */
    @RequestMapping("/getDemo")
    public Demo getDemo()
    {
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("zhangsan");
        demo.setCreateTime(new Date());
        return demo;
    }
}
