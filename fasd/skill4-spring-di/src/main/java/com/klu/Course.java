package com.klu;

public class Course {

    private String courseName;
    private int duration; // in months

    // Constructor Injection
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration   = duration;
    }

    public String getCourseName()        { return courseName; }
    public int getDuration()             { return duration; }
    public void setCourseName(String c)  { this.courseName = c; }
    public void setDuration(int d)       { this.duration = d; }

    @Override
    public String toString() {
        return courseName + " (" + duration + " months)";
    }
}
