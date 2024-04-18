package com.assproject.testing;

import com.assproject.model.Course;

import java.util.UUID;

public class assproject {
    public static void main(String[] args) {

        // Creating an object of the Course class.
        Course course = new Course();

        /**
         * Set values
         */
        course.setId(UUID.randomUUID().toString());
        course.setCourseCode("CSC481");
        course.setCreditUnit(4);
        course.setCourseName("OOP Course");
        course.setTerm(1);

        // Display the set value from the Course class
        System.out.println("Display course: " + course.toString());

    }
}
