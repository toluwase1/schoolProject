package com.company;

import java.util.ArrayList;
import java.util.List;

public class Principal extends Person {
    private String office;
    private String offence;


    //Constructor
    public Principal(String name, int id, String designation, String address, String gender, String office) {
        super(name, id, designation, address, gender);
        this.office = office;
    }

    public String getOffence() {
        return offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

    public boolean validateAge(Person applicant) {
        if ((applicant.getAge() >= 10) && (applicant.getAge() <= 22)) {
            return true;
        } else {
            return false;
        }
    }


    public boolean validateOffence(Students student) {
        if (this.offence == student.getOffence()) {
            return true;
        } else {
            return false;
        }

    }
//
//    public void introduceYourself(){
//        System.out.println("Hello, My Name is " + name);
//        System.out.println("My ID number is " + id);
//        System.out.println("I am a/an " + designation);
//    }


    }

