package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ResidentialProperty")
public class ResidentialPropertyEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int ID;

    @Column
    public int assessmentYear;

    @Column
    public String ownerName;

    @Column
    public String email;

    @Column
    public String address;

    @Column
    public String zonalClassification;

    @Column
    public String description;

    @Column
    public String status;

    @Column
    public int constructedYear;

    @Column
    public int builtUpArea;

    @Column
    public double totalPropertyTax;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAssessmentYear() {
        return assessmentYear;
    }

    public void setAssessmentYear(int assessmentYear) {
        this.assessmentYear = assessmentYear;
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

    public double getTotalPropertyTax() {
        return totalPropertyTax;
    }

    public void setTotalPropertyTax(double totalPropertyTax) {
        this.totalPropertyTax = totalPropertyTax;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "ResidentialPropertyEntity{" +
                "ID=" + ID +
                ", assessmentYear=" + assessmentYear +
                ", ownerName='" + ownerName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", zonalClassification='" + zonalClassification + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", constructedYear=" + constructedYear +
                ", builtUpArea=" + builtUpArea +
                ", totalPropertyTax=" + totalPropertyTax +
                '}';
    }
}
