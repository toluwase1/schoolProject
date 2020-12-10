package com.company;

public class Main {
    // This main method is the entry point for all java applications
    // code is executed sequentially, line by line here
    public static void main(String[] args) {
        Person principal;

        principal = new Person();
        principal.name = "Chika Nwobi";
        principal.id = 100;
        principal.office = "First floor, Room 1";

        principal.principalIntro();
    }
}
