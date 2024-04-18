package com.assproject.overriding;

//Test class to create objects and call the methods
public class MethodOverriding{
    public static void main(String args[]){
        CSC1 a = new CSC1();
        CSC2 b = new CSC2();
        CSC3 c = new CSC3();

        System.out.println("Grade Point: "+ a.getGrade());
        System.out.println("Grade Point: "+ b.getGrade());
        System.out.println("Grade Point: "+ c.getGrade());
    }
}
