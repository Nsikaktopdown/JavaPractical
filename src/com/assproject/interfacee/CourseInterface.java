package com.assproject.interfacee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Me
 */


interface CourseInterface {
    public void createCourse(String courseCode);
    public void readCourse();
    public void updateCourse(String courseCode);
    public void deleteCourse(String courseCode);
}


class CourseInterfaceImpl implements CourseInterface{
    ArrayList<String> courses = new ArrayList<String>();

    @Override
    public void createCourse(String courseCode){
        courses.add(courseCode);
    }

    @Override
    public void readCourse(){
        for (int i = 0; i<courses.size();i++){
            System.out.println("Courses " + i + " : " + courses.get(i));
        }
    }


    @Override
    public void updateCourse(String courseCode){
        courses.set(5, courseCode);
    }

    @Override
    public void deleteCourse(String courseCode){
        courses.remove(courseCode);
    }


}

