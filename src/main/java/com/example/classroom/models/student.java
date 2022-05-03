package com.example.classroom.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table
public class student {
    @Id
    @Column
    private String USN;
    @Column
    private String NAME;
    @Column
    private String EMAIL;
    @Column
    private String PHONE;

    
    
    
    public student() {
    }

    
    public String getUSN() {
        return this.USN;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }

    public String getNAME() {
        return this.NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return this.EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return this.PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

}
