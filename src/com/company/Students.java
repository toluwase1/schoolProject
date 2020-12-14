package com.company;

import java.util.List;

public class Students extends Person {
    private  String studentClass;
    private String courses;
    private String offence;

    public Students(String name, int id, String designation, String address, String gender) {
        super(name, id, designation, address, gender);
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getOffence() {
        return this.offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

}
    //    public void studentIntro;

//    /@Override
//    public void IntroduceYourself() {
//        super.IntroduceYourself();
//    }
//    public void introduceStudent(){
//        System.out.println("Hello, My Name is " + name);
//        System.out.println("My ID number is " + id);
//        String adminJob = "Accountant";
//        designation = "student";
//        String year = "year 1";
//        System.out.println("I am in "+ year);
//    }

