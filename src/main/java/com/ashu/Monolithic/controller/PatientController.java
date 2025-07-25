package com.ashu.Monolithic.controller;

import com.ashu.Monolithic.Model.Patient;
import com.ashu.Monolithic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public  List<Patient> getAll()
    {

        return  patientService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }
    @PostMapping("/add")
    public  Patient add(@RequestBody Patient patient )
    {
    return  patientService.add(patient);
    }
    
    @PutMapping("/update/{id}")
    public Patient update(@RequestBody Patient patient, @PathVariable Long id)
    {
        
        return patientService.update(patient,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        return  patientService.deletePatient(id);
    }
}

