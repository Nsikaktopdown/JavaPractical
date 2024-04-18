package com.assproject.encapsulation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Me
 */


class Student{
    //private data member
    public String Matno;
    private String name;

    //getter and setter method for variables
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }


//    public String getMatno() {
//        return Matno;
//    }


    public void setMatno(String Matno) {
        this.Matno = Matno;
    }

}


