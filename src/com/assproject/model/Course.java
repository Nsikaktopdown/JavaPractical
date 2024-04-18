package com.assproject.model;

public class Course {

    /**
     * Variable Declarations
     */
    private String id;
    private String courseName;

    private int term;

    private int creditUnit;
    private String courseCode;

    /**
     * No argument constructor
     */
    public Course() {
    }

    /**
     * Argument Constructor
     *
     * @param id
     * @param courseName
     * @param term
     * @param creditUnit
     * @param courseCode
     */
    public Course(String id, String courseName, int term, int creditUnit, String courseCode) {
        this.id = id;
        this.courseName = courseName;
        this.term = term;
        this.creditUnit = creditUnit;
        this.courseCode = courseCode;
    }


    /**
     * Getters and Setters Methods.
     *
     * @return
     */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getCreditUnit() {
        return creditUnit;
    }

    public void setCreditUnit(int creditUnit) {
        this.creditUnit = creditUnit;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                ", term=" + term +
                ", creditUnit=" + creditUnit +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }

}
