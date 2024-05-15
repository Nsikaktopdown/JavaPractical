package com.assproject.basics;

public class TestJavaClass{

    public static void dropTable(){

    }
    // Main function
    public static void main(String[] args){
        /**
         * We have created an object of the Java Class
         */
        JavaClass object = new JavaClass("Peter");

        object.showMessage();
        dropTable();

    }

}
