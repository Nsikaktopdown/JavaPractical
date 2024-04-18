package com.assproject.interfacee;

import java.util.ArrayList;

public class InterfaceTest {
    public static void main(String args[]){
        CourseInterfaceImpl course = new CourseInterfaceImpl();

        String courseCode1 = "CSC 481";
        String courseCode2 = "CSC 482";
        String courseCode3 = "CSC 483";
        String courseCode4 = "CSC 484";
        String courseCode5 = "CSC 485";

        course.createCourse(courseCode1);
        course.createCourse(courseCode2);
        course.createCourse(courseCode3);
        course.createCourse(courseCode4);
        course.createCourse(courseCode5);
        course.readCourse();
    }
}
