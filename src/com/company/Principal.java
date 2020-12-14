package com.company;

public class Principal extends Person{
    private String Office;

//Constructor
    public Principal(String name, int id, String designation, String address, String gender, String office) {
        super(name, id, designation, address, gender);
        Office = office;
    }





    public void introduceYourself(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        System.out.println("I am a/an " + designation);
    }


}
