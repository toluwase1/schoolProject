package com.company;
// the abstract makes it inaccessible by any other classes except by those inheriting from it
public abstract class Person {
    private String name;
    private int id;
    private String designation;
    private String address;
    private String gender;

    //constructor method
    public Person(String name, int id, String designation, String address, String gender) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.address = address;
        this.gender = gender;
    }

    //methods
        public void IntroduceYourself () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("I am a/an " + designation);
        }

}
