package com.assproject.abstraction1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */

abstract class CourseAb {

    public abstract void courseCode();

    public void courseName() {
        System.out.println("Advanced Object-oriented programming II");
    }
}


class Assignment extends CourseAb {
    public void courseCode() {
        System.out.println("The course code is : CSC 481");
    }
}


