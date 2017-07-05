package com.my.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by pc on 2017/7/5.
 */
public class Demo
{
    private int id;
    private String name;

    //com.alibaba.fastjson.annotation.JSONField
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;//创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
