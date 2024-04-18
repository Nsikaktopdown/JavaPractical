package com.assproject.encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
        //creating instance of the encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("Charles");
        //getting value of the name member
        System.out.println(s.getName());

    }

}
