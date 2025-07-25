package com.ashu.Monolithic.repository;

import com.ashu.Monolithic.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {


}
