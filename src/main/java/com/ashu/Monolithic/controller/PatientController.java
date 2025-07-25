package com.ashu.Monolithic.controller;

import com.ashu.Monolithic.Model.Patient;
import com.ashu.Monolithic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/Patient")
@RestController // @Controller + @ResponseBody
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/health")
    public String health()
    {

        return "UP "+System.currentTimeMillis();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Patient>> getAll()
    {
        List<Patient> all = patientService.getAll();
        return  new ResponseEntity<>(all,HttpStatus.OK);
    }
}

