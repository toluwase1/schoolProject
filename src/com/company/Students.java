package com.company;

public class Students extends Person {
    public Students(String name, int id, String designation, String year) {
        super(name, id, designation);
    }
//    public void studentIntro;


    @Override
    public void IntroduceYourself() {
        super.IntroduceYourself();
    }
    public void introduceStudent(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        String adminJob = "Accountant";
        designation = "student";
        String year = "year 1";
        System.out.println("I am in "+ year);
    }
}
