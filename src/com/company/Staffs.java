package com.company;

public class Staffs extends Person {
    public Staffs(String name, int id, String office, String course, String staffRoom, String adminJob, String classRoom, int applicantId) {
        super(name, id, office, course, staffRoom, adminJob, classRoom, applicantId);
    }

    public void schoolWork(){
        System.out.println("I work in the School");
    }
}
