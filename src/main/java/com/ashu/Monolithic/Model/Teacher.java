package com.ashu.Monolithic.Model;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    int id;
    String name;

    public Teacher() {

        System.out.println("Object creation by Spring Container using by @Component");
    }

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
