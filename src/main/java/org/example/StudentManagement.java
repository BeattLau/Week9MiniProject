package org.example;

import java.util.List;

public class StudentManagement {

    private static List<Student> studentList;

    public StudentManagement(List<Student> studentList) {
        this.studentList = studentList;
    }

    public static void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }


    public static void updateStudentDetails(String newName, int studentId, String newEnrolledCourses) {
        for (Student student : studentList) {
            if (student.getStudentId() == studentId) {
                student.setName(newName);
                student.setEnrolledCourses(newEnrolledCourses);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student not found. Update failed.");
    }

    public static void removeStudent(Student student) {
        studentList.remove(student);
        System.out.println("Student removed successfully.");
    }

    public static Student searchForStudent(int idToSearch) {
        for (Student student : studentList) {
            if (student.getStudentId() == idToSearch){
                return student;

            }
        }
        return null;
    }
}