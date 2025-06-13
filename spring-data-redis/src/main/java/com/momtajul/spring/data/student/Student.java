package com.momtajul.spring.data.student;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("students")
public class Student implements Serializable {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
