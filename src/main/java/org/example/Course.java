package org.example;

public class Course {
    String courseName;
    int courseID;
    String enrolledStudents;

    public Course(String courseName, int courseID, String enrolledStudents) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = enrolledStudents;
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
}
