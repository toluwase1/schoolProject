package com.company;

public class Main {
    // This main method is the entry point for all java applications
    // code is executed sequentially, line by line here
    //Objects are runtime concepts which does not  exist until the application runs
    //methods do all of the work (the main method). Thats the starting point of every java application
    public static void main(String[] args) {
        Person principal = new Person("Chika", 100, "First floor, Room 1");
//        principal.name = "Chika Nwobi";
//        principal.id = 100;
//        principal.office = "First floor, Room 1";
        principal.principalIntro();

        Person teachingStaffs = new Person();
        teachingStaffs.teacherIntro();

        Person nonTeaching = new Person();
        nonTeaching.adminIntro();

        Person Staff = new Person();
    }

}
