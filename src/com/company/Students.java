package com.company;

public class Students extends Person {
//    public void studentIntro;

    public Students(String name, int id, String office, String course, String staffRoom, String adminJob, String classRoom, int applicantId) {
        super(name, id, office, course, staffRoom, adminJob, classRoom, applicantId);
    }

    @Override
    public void studentIntro() {
        super.studentIntro();
    }
}
