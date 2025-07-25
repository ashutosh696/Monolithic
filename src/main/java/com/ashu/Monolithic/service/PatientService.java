package com.ashu.Monolithic.service;

import com.ashu.Monolithic.Model.Patient;
import com.ashu.Monolithic.Model.Services;
import com.ashu.Monolithic.Model.Student;
import com.ashu.Monolithic.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    @Qualifier("neha")
    Student student;

     /*List<Services> servicesList =new ArrayList<>(

            Arrays.asList(new Services( "X-ray", 500L),new Services( "Scan", 600L))
    );
*/
   /* List<Patient> list = new ArrayList<>(
            Arrays.asList(
                    new Patient(1L, "Ashu", "Delhi", servicesList),
                    new Patient(2L, "Neha", "New Delhi", servicesList)
            )
    );*/

/*public List<Patient> getAll()
{
    //System.out.println("this is coming due to @Primary if @qualifer was not using"+student.getName());
    return list;
}
    public List<Services> getAllService()
    {
        System.out.println("this is coming due to   @qualifer "+student.getName());
        return servicesList;
    }*/

    public  Patient add(Patient patient)
    {

        return patientRepository.save(patient);
    }


    public Patient getPatientById(  Long id) {
        return patientRepository.findById(id).orElse(null);
    }
    public List<Patient> getAll() {

        return patientRepository.findAll();
    }

    public Patient update( Patient updatedPatient, Long id)
    {
        Optional<Patient> optionalPatient = patientRepository.findById(id);
        if (optionalPatient.isPresent()) {
            Patient patients = optionalPatient.get();
            patients.setName(updatedPatient.getName());
            patients.setAddress(updatedPatient.getAddress());
            // Update services safely without replacing the entire list
            patients.getServicesList().clear();  // removes orphans
            patients.getServicesList().addAll(updatedPatient.getServicesList());

            return patientRepository.save(patients);
        }
        return null;
    }


    public String deletePatient( Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            return "Patient deleted";
        } else {
            return "Patient not found";
        }
    }
}

