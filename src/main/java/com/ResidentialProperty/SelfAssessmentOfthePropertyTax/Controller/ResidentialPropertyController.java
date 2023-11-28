package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Controller;

import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Model.ResidentialPropertyRequestPayload;
import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Service.ResidentialPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propertyTax")
public class ResidentialPropertyController {

    @Autowired
    private ResidentialPropertyService service;

    @PostMapping("/submit")
    public void propertyTaxSubmission(@RequestBody ResidentialPropertyRequestPayload residentialPropertyRequestPayload) throws Exception {
        service.propertyTaxService(residentialPropertyRequestPayload);
    }
}
