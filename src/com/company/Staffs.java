package com.company;

public class Staffs extends Person {
    public Staffs(String name, int id, String designation) {
        super(name, id, designation);
    }

    public void schoolWork(){
        System.out.println("I work in the School");
    }
}
