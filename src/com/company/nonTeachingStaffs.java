package com.company;

public class nonTeachingStaffs extends Staffs{

    public nonTeachingStaffs(String name, int id, String designation, String adminJob) {
        super(name, id, designation);
    }

    public void introduceYourself(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        System.out.println("I am a/an " + designation);
        String adminJob = "Accountant";
        System.out.println("I am an "+ adminJob);
    }
}
