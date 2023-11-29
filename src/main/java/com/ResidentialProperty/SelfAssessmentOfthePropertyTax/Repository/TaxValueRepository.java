package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Repository;

import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity.ZoneValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaxValueRepository extends JpaRepository<ZoneValue,Integer> {

    @Query("SELECT c.taxValue from ZoneValue c WHERE c.description = :description AND c.status = :status AND c.zonalClassification = :zonalClassification")
    double findTaxValueByFields(@Param("description") String description, @Param("status") String status, @Param("zonalClassification") String zonalClassification);
}
