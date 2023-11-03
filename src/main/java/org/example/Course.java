package org.example;

import java.util.HashMap;
import java.util.Map;

public class Course {
    String courseName;
    int courseID;
    String enrolledStudents;
    private Map<Integer, Double> studentGrades;

    public Course(String courseName, int courseID, String enrolledStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = enrolledStudents;
        this.studentGrades= new HashMap<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(String enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public double addGrade(int studentId, double grade) {
        studentGrades.put(studentId,grade);
        return grade;
    }

    public Double getGrade(int studentId) {
       return studentGrades.getOrDefault(studentId, 0.0);
    }

    public void displayGrades(){
        for (Map.Entry<Integer, Double> entry : studentGrades.entrySet()) {
            int studentId = entry.getKey();
            double grade = entry.getValue();
            System.out.println("Student ID: " + studentId + ", Grade: " + grade);
        }
    }
}

