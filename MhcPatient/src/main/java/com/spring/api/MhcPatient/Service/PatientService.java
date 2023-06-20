package com.spring.api.MhcPatient.Service;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.spring.api.MhcPatient.Model.Patient;
//import com.spring.api.MhcPatient.Model.resource;
//import com.spring.api.MhcPatient.Repository.PatientRepository;
//import com.spring.api.MhcPatient.Request.PatientRequest;
//
//@Service
//public class PatientService {
//
//    @Autowired
//    private PatientRepository repository;
//
//    public Patient savePatient(PatientRequest patientRequest) {
//        resource resource = new resource();
//        resource.setFullUrl("urn:uid-" + patientRequest.getId());
//        resource.setResourceType("PATIENT");
//
//        Patient patient = Patient.build(patientRequest.getId(), List.of(resource));
//        return repository.save(patient);
//    }
//}

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.api.MhcPatient.Model.Patient;
import com.spring.api.MhcPatient.Model.basicDetails;
import com.spring.api.MhcPatient.Model.resource;
import com.spring.api.MhcPatient.Repository.PatientRepository;
import com.spring.api.MhcPatient.Request.PatientRequest;

@Service
public class PatientService {

    @Autowired
    private PatientRepository repository;

    public Patient savePatient(PatientRequest patientRequest) {
        String uid = generateUID(); // Generate UID
        resource resource = new resource();
       basicDetails basicDetails = new basicDetails();
       basicDetails.setCoding(patientRequest.getBasicDetails().get(0).getCoding());
        resource.setFullUrl("urn:uuid:" + uid);
        resource.setResourceType("PATIENT");
       
       
        Patient patient = Patient.build(uid, List.of(resource), List.of(basicDetails));
        patient.setId(uid); // Set the _id value as UID
        return repository.save(patient);
    }

    private String generateUID() {
        // Generate a random alphanumeric ID with 6 digits
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
}

