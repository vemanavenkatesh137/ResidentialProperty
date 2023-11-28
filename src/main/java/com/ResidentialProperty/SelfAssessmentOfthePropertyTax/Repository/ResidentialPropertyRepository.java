package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Repository;

import com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity.ResidentialPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentialPropertyRepository extends JpaRepository<ResidentialPropertyEntity,Integer> {


}
