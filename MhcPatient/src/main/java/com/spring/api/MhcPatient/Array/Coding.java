package com.spring.api.MhcPatient.Array;

import jakarta.validation.constraints.NotBlank;

public class Coding {
    private String system;
    
    @NotBlank(message = "code shouldn't be null")
    private String code;
    
    public String getSystem() {
        return system;
    }
    
    public void setSystem(String system) {
                 this.system = "http://terminology.hl7.org/CodeSystem/v2-0203";
    
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
