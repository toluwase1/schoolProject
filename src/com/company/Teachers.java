package com.company;

public class Teachers extends Person{

private String teacherClass;

    public Teachers(String name, int id, String designation, String address, String gender) {
        super(name, id, designation, address, gender);
    }

    //creat a methode call gettecher class
    public String getTeacherClass() {
        return teacherClass;
    }

    public void setTeacherClass(String teacherClass) {
        this.teacherClass = teacherClass;
    }
    //    @Override
//    public void IntroduceYourself() {
//        super.IntroduceYourself();
//    }
//
//    @Override
//    public void introduceYourself() {
//        super.introduceYourself();
//    }
//
//    public void introduceTeacher(){
//        System.out.println("Hello, My Name is " + name);
//        System.out.println("My ID number is " + id);
//        System.out.println("I am a/an " + designation);
//        String course = "Mathematics";
//        System.out.println("I teach "+ course);
//    }

}
