package com.spring.api.MhcPatient.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.api.MhcPatient.Model.Patient;

public interface PatientRepository extends MongoRepository <Patient, String> {

	Patient findById(int id);

//	Patient findById(String maritalStatus);

	void deleteById(int id);

}