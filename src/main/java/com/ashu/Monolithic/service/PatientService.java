package com.ashu.Monolithic.service;

import com.ashu.Monolithic.Model.Patient;
import com.ashu.Monolithic.Model.Services;
import com.ashu.Monolithic.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PatientService {

    @Autowired
    @Qualifier("neha")
    Student student;

    List<Services> servicesList =new ArrayList<>(

            Arrays.asList(new Services(1, "X-ray", 500),new Services(2, "Scan", 600))
    );

    List<Patient> list = new ArrayList<>(
            Arrays.asList(
                    new Patient(1, "Ashu", "Delhi", servicesList),
                    new Patient(2, "Neha", "New Delhi", servicesList)
            )
    );

public List<Patient> getAll()
{
    //System.out.println("this is coming due to @Primary if @qualifer was not using"+student.getName());
    return list;
}
    public List<Services> getAllService()
    {
        System.out.println("this is coming due to   @qualifer "+student.getName());
        return servicesList;
    }


}

