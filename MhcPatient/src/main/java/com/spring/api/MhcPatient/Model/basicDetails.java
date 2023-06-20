package com.spring.api.MhcPatient.Model;

import java.util.List;

import com.spring.api.MhcPatient.Array.Coding;

public class basicDetails {
	
	private List<Coding> coding;	
	public List<Coding> getCoding() {
		return coding;
	}

	public void setCoding(List<Coding> coding) {
		this.coding = coding;
	}

}
