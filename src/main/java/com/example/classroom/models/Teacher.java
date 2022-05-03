package com.example.classroom.models;


import javax.persistence.Id;
import javax.persistence.Table;


// @Table
public class Teacher {
    // @Id
    private String TSSN;
    private String T_NAME;
    private String T_MAIL;
    private String T_PHONE;


    public String getTSSN() {
        return this.TSSN;
    }

    public void setTSSN(String TSSN) {
        this.TSSN = TSSN;
    }

    public String getT_NAME() {
        return this.T_NAME;
    }

    public void setT_NAME(String T_NAME) {
        this.T_NAME = T_NAME;
    }

    public String getT_MAIL() {
        return this.T_MAIL;
    }

    public void setT_MAIL(String T_MAIL) {
        this.T_MAIL = T_MAIL;
    }

    public String getT_PHONE() {
        return this.T_PHONE;
    }

    public void setT_PHONE(String T_PHONE) {
        this.T_PHONE = T_PHONE;
    }
    
}
