package com.company;

public class Teachers extends Staffs{

    public Teachers(String name, int id, String designation, String course) {
        super(name, id, designation);
    }

    @Override
    public void IntroduceYourself() {
        super.IntroduceYourself();
    }

    @Override
    public void introduceYourself() {
        super.introduceYourself();
    }

    public void introduceTeacher(){
        System.out.println("Hello, My Name is " + name);
        System.out.println("My ID number is " + id);
        System.out.println("I am a/an " + designation);
        String course = "Mathematics";
        System.out.println("I teach "+ course);
    }

}
