package com.company;

public class Staffs extends Person {
    public Staffs(String name, int id, String designation) {
        super(name, id, designation);
    }

    public void schoolWork(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        System.out.println("I am a/an " + designation);
    }
}
