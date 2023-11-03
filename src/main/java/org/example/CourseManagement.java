package org.example;

import java.util.List;

public class CourseManagement {
    private static List<Course> courseList;

    public CourseManagement(List<Course> courseList) {
        this.courseList = courseList;
    }

    public static void addNewCourse(Course course) {
        courseList.add(course);
        System.out.println("New course added successfully.");
    }

    public static void updateCourse(String newCourseName, int courseId, String newEnrolledStudents) {
        for (Course course : courseList) {
            if (course.getCourseID() == courseId) {
                course.setCourseName(newCourseName);
                course.setEnrolledStudents(newEnrolledStudents);
                System.out.println("Course details updated successfully.");
                return;
            }
        }
        System.out.println("Course not found. Update failed.");
    }

    public static void removeACourse(Course course) {
        courseList.remove(course);
        System.out.println("Course removed successfully.");
    }


    public static Course searchForCourse(int courseIdToSearch) {
        for (Course course : courseList) {
            if (course.getCourseID() == courseIdToSearch) {
                return course;

            }
        }
        return null;
    }
}