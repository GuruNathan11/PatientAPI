package com.spring.api.MhcPatient.Model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.spring.api.MhcPatient.Request.PatientRequest;

@Document(collection = "Patientlist")
public class Patient {
    @Id
    private String id;
    private List<resource> resource;
    private List<basicDetails> basicDetails;
  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<resource> getResource() {
        return resource;
    }

    public void setResource(List<resource> resource) {
        this.resource = resource;
    }
    
	public List<basicDetails> getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(List<basicDetails> basicDetails) {
		this.basicDetails = basicDetails;
	}
  
	//************ Constructor Method  ************\\
	
	public Patient(String id, List<resource> resource, List<basicDetails> basicDetails) {
        this.id = id;
        this.resource = resource;
       this.basicDetails = basicDetails;
    }

    public static Patient build(String id, List<resource> resource, List<basicDetails> basicDetails) {
        return new Patient(id, resource, basicDetails);
    }

    public void update(PatientRequest patientRequest) {
        this.setResource(patientRequest.getResource());
        this.setBasicDetails(patientRequest.getBasicDetails());
    }	
}
