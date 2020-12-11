package com.company;

public class Person {
    String name;
    int id;
    String office;
    String course;
    String staffRoom;
    String adminJob;
    String classRoom;
    int applicantId;

    //constructor method
    public Person(String name,
                  int id,
                  String office,
                  String course,
                  String staffRoom,
                  String adminJob,
                  String classRoom,
                  int applicantId){
        this.name = name;
        this.id = id;
        this.office = office;
        this.course = course;
        this.staffRoom = staffRoom;
        this.adminJob = adminJob;
        this.classRoom = classRoom;
        this.applicantId = applicantId;
    }

    public Person() {
        
    }

    public Person(String chika, int i, String s) {
    }

//methods


        public void principalIntro () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("My Office is at " + office);
        }
        public void teacherIntro () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("My Office is at " + staffRoom);
            System.out.println("I teach " + course);
        }
        public void adminIntro () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("My Office is at " + staffRoom);
            System.out.println("I am a/an " + adminJob);
        }
        public void studentIntro () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My ID number is " + id);
            System.out.println("My Class is at " + classRoom);
        }
        public void applicantIntro () {
            System.out.println("Hello, My Name is " + name);
            System.out.println("My Applicant ID is " + applicantId);
            System.out.println("I am not entitled to a room yet");
        }




}
