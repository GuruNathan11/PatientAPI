package com.spring.api.MhcPatient.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.api.MhcPatient.Model.Patient;
import com.spring.api.MhcPatient.Request.PatientRequest;
import com.spring.api.MhcPatient.Service.PatientService;

@RestController
@RequestMapping("/api/patient")

public class PatientController {

	@Autowired
	private PatientService service;

	@GetMapping
	public String welcome() {
		return "Welcome to Patient API";
	}
	
	@PostMapping("/add")
	public ResponseEntity<Patient> savePatient(@RequestBody @Validated PatientRequest patientRequest) {
		return new ResponseEntity<Patient>(service.savePatient(patientRequest), HttpStatus.CREATED);
	}
	
}