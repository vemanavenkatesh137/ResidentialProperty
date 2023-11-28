package com.ResidentialProperty.SelfAssessmentOfthePropertyTax.Entity;

import jakarta.persistence.*;

@Entity
public class ZoneValue {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int ID;

    @Column
    public String description;

    @Column
    public String status;

    @Column
    public String zonalClassification;

    @Column
    public double taxValue;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getZonalClassification() {
        return zonalClassification;
    }

    public void setZonalClassification(String zonalClassification) {
        this.zonalClassification = zonalClassification;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }

    @Override
    public String toString() {
        return "ZoneValue{" +
                "ID=" + ID +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", zonalClassification='" + zonalClassification + '\'' +
                ", taxValue=" + taxValue +
                '}';
    }
}
