package com.ashu.Monolithic.Model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Patient {
    int id;
    String name;
    String Address;
List<Services> servicesList;
    public Patient() {
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
    }

    public Patient(int id, String name, String address, List<Services> servicesList) {
        this.id = id;
        this.name = name;
        Address = address;
        this.servicesList = servicesList;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
