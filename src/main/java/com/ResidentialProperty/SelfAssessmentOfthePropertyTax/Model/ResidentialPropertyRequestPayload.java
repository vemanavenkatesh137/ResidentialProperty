package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = false)
public class ResidentialPropertyRequestPayload {

    @JsonProperty("Year of Assessment")
    public int yearAssessment;

    @JsonProperty("Name of the Owner")
    public String ownerName;

    @JsonProperty("Email")
    public String email;

    @JsonProperty("Address of Property")
    public String address;

    @JsonProperty("Zonal Classification")
    public String zonalClassification;

    @JsonProperty("Description of the Property")
    public String description;

    @JsonProperty("Status")
    public String status;

    @JsonProperty("Building Constructed Year")
    public int constructedYear;

    @JsonProperty("Built Up Area")
    public int builtUpArea;

    public int getYearAssessment() {
        return yearAssessment;
    }

    public void setYearAssessment(int yearAssessment) {
        this.yearAssessment = yearAssessment;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZonalClassification() {
        return zonalClassification;
    }

    public void setZonalClassification(String zonalClassification) {
        this.zonalClassification = zonalClassification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getConstructedYear() {
        return constructedYear;
    }

    public void setConstructedYear(int constructedYear) {
        this.constructedYear = constructedYear;
    }

    public int getBuiltUpArea() {
        return builtUpArea;
    }

    public void setBuiltUpArea(int builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    @Override
    public String toString() {
        return "ResidentialPropertyRequestPayload{" +
                "yearAssessment=" + yearAssessment +
                ", ownerName='" + ownerName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", zonalClassification='" + zonalClassification + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", constructedYear=" + constructedYear +
                ", builtUpArea=" + builtUpArea +
                '}';
    }
}
