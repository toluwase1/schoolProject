package com.company;

public class Person {
    String name;
    int id;
    String designation;

    //constructor method
    public Person(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

//methods
        public void IntroduceYourself () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("I am a/an " + designation);
        }
}
