package com.company;

import java.util.ArrayList;
import java.util.List;

public class School {


    private String schoolName;
    private List<Person> applicants = new ArrayList<>();
    private List<Person> students = new ArrayList<>();
    private List<Person> nonTeachingStaff = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }


    //add to list of applicant
    public void addApplicant(Person applicant) {
        this.applicants.add(applicant);
    }

    //get applicant list
    public List<Person> getApplicants() {
        return this.applicants;
    }

    //Admitting applicant
    public void admitStudents(Person applicant, Principal principal) {
        if (principal.validateAge(applicant)) {
            this.students.add(applicant);
        } else {
            System.out.println("Applicant inadmissible");
        }
    }

    public List<Person> getStudents() {
        return this.students;
    }

    //Expulsion Method
    public void expelStudents(Students student, Principal principal) {
        if (principal.validateOffence(student)) {
            this.students.remove(student);
        }
    }

    //
    private List<String> jss1Course;
    private List<String> jss2Course;
    private List<String> jss3Course;

    public List<String> getJss1Course() {
        return jss1Course;
    }

    public void setJss1Course(List<String> jss1Course) {
        this.jss1Course = jss1Course;
    }

    public List<String> getJss2Course() {
        return jss2Course;
    }

    public void setJss2Course(List<String> jss2Course) {
        this.jss2Course = jss2Course;
    }

    public List<String> getJss3Course() {
        return jss3Course;
    }

    public void setJss3Course(List<String> jss3Course) {
        this.jss3Course = jss3Course;
    }


    //assigning courses to teacher

    public List<String> getTeacherCourse(Teachers teacher) {
        if (teacher.getTeacherClass() == "jss1") {
            return getJss1Course();
        } else if (teacher.getTeacherClass() == "jss2") {
            return getJss2Course();
        } else {
            return getJss3Course();
        }
    }



    //assing courses to students
    public List<String> getStudentCourse(Students student) {
        if (student.getStudentClass() == "jss1") {
            return getJss1Course();
        } else if (student.getStudentClass() == "jss2") {
            return getJss2Course();
        } else {
            return getJss3Course();
        }

    }

    //get non teaching staff
    public void addNonTeachingStaff(Person nonTeachingStaff) {
        if (nonTeachingStaff.getDesignation() == "Non-Teaching Staff") {
            this.nonTeachingStaff.add(nonTeachingStaff);
        }
        }


    public List<Person> getNonTeachingStaff() {
        return nonTeachingStaff;
    }

}



