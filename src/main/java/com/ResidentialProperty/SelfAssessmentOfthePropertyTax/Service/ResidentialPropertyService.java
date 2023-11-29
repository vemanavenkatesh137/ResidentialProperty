package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Service;

import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity.ResidentialPropertyEntity;
import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity.ZoneValue;
import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Model.ResidentialPropertyRequestPayload;
import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Repository.ResidentialPropertyRepository;
import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Repository.TaxValueRepository;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class ResidentialPropertyService {

    @Autowired
    private ResidentialPropertyRepository residentialPropertyRepository;

    @Autowired
    private TaxValueRepository taxValueRepository;

    public void propertyTaxService(ResidentialPropertyRequestPayload requestPayload) throws Exception {
        ResidentialPropertyEntity entity = new ResidentialPropertyEntity();
        double taxValue = taxCalulation(requestPayload);
        double total1 = requestPayload.getBuiltUpArea()*taxValue*10;
        double depreciationValue = requestPayload.getYearAssessment()-requestPayload.getConstructedYear() <60 ? ((requestPayload.getYearAssessment()-requestPayload.getConstructedYear())/100) : 0.6;
        double total2 = total1 - (total1*depreciationValue);
        double total3 = total2*0.2;
        double total4 = total3*0.24;
        double total5 = total3+total4;

        entity.setAssessmentYear(requestPayload.getYearAssessment());
        entity.setOwnerName(requestPayload.getOwnerName());
        entity.setEmail(requestPayload.getEmail());
        entity.setAddress(requestPayload.getAddress());
        entity.setZonalClassification(requestPayload.getZonalClassification());
        entity.setDescription(requestPayload.getDescription());
        entity.setStatus(requestPayload.getStatus());
        entity.setConstructedYear(requestPayload.getConstructedYear());
        entity.setBuiltUpArea(requestPayload.getBuiltUpArea());
        entity.setTotalPropertyTax(total5);
        residentialPropertyRepository.save(entity);
    }
    public double taxCalulation(ResidentialPropertyRequestPayload requestPayload) throws Exception {
        if((requestPayload.getDescription() !=null && !requestPayload.getDescription().isEmpty()) && (requestPayload.getStatus() !=null && !requestPayload.getStatus().isEmpty()) && (requestPayload.getZonalClassification() !=null && !requestPayload.getZonalClassification().isEmpty())){
            return taxValueRepository.findTaxValueByFields(requestPayload.getDescription(),requestPayload.getStatus(),requestPayload.getZonalClassification());
        }else{
            throw new Exception("Record with discription or status or zonalClassification not exist in Database");
        }
    }

}
