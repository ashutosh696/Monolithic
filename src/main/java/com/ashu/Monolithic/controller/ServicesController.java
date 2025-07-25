package com.ashu.Monolithic.controller;

import com.ashu.Monolithic.Model.Services;
import com.ashu.Monolithic.service.KafkaProducer;
import com.ashu.Monolithic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Services")
public class ServicesController {

    @Autowired
    PatientService patientService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Services>> getAllServices() {
        List<Services> allService = patientService.getAllService();
        return new  ResponseEntity<>(allService,HttpStatus.OK);
    }

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("kafka/publish")
    public String sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);
        return "KafkaProducer send message--> " + message;
    }
}