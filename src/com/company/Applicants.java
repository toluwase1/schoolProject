package com.company;

public class Applicants extends Person {
    public Applicants(String name, int id, String designation) {
        super(name, id, designation);
    }

    public void introduceYourself(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        System.out.println("I am a/an " + designation);
        String designation = "applicant";
    }
}
