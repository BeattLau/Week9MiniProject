package org.example;

public class Student {
    String name;
    int studentId;
    String enrolledCourses;

    public Student(String name, int studentId, String enrolledCourses) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = enrolledCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

}
