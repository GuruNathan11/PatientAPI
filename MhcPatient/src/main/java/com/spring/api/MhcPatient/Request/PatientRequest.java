package com.spring.api.MhcPatient.Request;

import java.util.List;

import com.spring.api.MhcPatient.Model.basicDetails;
import com.spring.api.MhcPatient.Model.resource;

public class PatientRequest {

    private String id;
    private List<resource> resource;
    private List<basicDetails> basicDetails;
    
    public List<resource> getResource() {
        return resource;
    }

    public void setResource(List<resource> resource) {
        this.resource = resource;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<basicDetails> getBasicDetails() {
		return basicDetails;
	}

	public void setBasicDetails(List<basicDetails> basicDetails) {
		this.basicDetails = basicDetails;
	}
	 
}