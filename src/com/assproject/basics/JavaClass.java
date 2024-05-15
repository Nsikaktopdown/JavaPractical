package com.assproject.basics;

/**
 * Basics of Java programming
 * Classes, attributes(Variables & methods)
 * Objects
 * Main method
 */
public class JavaClass {

    // private public protected
    public int number = 0;
    private String name;

    // constructor
    public JavaClass(String name) {
        this.name = name;
    }

    // Return Method
    public int getNumber() {
        return number;
    }

    // No return type method
    public void showMessage() {
        System.out.println("Show me a new message:" + name);
    }
}



