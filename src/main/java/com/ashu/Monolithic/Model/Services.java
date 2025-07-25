package com.ashu.Monolithic.Model;

import org.springframework.stereotype.Component;

@Component
public class Services {
    int id;
    String name;
    int fees;

    public Services() {
    }

    public Services(int id, String name, int fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
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

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
