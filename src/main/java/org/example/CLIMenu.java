package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CLIMenu {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        UserManagement userManagement = new UserManagement(userList);
        List<Course> courseList = new ArrayList<>();
        CourseManagement courseManagement = new CourseManagement(courseList);


        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMainMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("To user management menu");
                    userManagementMenu(sc, userManagement);
                    break;
                case 2:
                    System.out.println("To student information menu");
                    studentInformationMenu(sc);
                    break;
                case 3:
                    System.out.println("To course management menu");
                    courseManagementMenu(sc, courseManagement);
                    break;
                case 4:
                    System.out.println("Exiting system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    public static void displayMainMenu() {
        System.out.println("Main menu: ");
        System.out.println("1. User management");
        System.out.println("2. Student Information management");
        System.out.println("3. Course management");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice: ");
    }

    public static void userManagementMenu(Scanner sc, UserManagement userManagement) {
        while (true) {
            System.out.println("User Management menu: ");
            System.out.println("1. Add user");
            System.out.println("2. Update user");
            System.out.println("3. Remove user");
            System.out.println("4. Search for user");
            System.out.println("5. Display all users");
            System.out.println("6. Back to main menu");
            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding a user");
                    System.out.print("Enter the username: ");
                    String username = sc.next();
                    System.out.print("Enter the password: ");
                    String password = sc.next();

                    User newUser = new User(username, password);

                    userManagement.addUser(newUser);

                    System.out.println("User added successfully.");
                    break;

                case 2:
                    System.out.println("Updating a user");
                    System.out.print("Enter the username to update: ");
                    String userName = sc.next();
                    System.out.print("Enter the new password: ");
                    String newPassword = sc.next();
                    userManagement.updateUser(userName, newPassword);
                    break;
                case 3:
                    System.out.println("Deleting a user");
                    System.out.print("Enter the username to delete: ");
                    String usernameToDelete = sc.next();
                    User userToDelete = userManagement.searchForUser(usernameToDelete);

                    if (userToDelete != null) {
                        userManagement.removeUser(userToDelete);
                        System.out.println("User deleted successfully.");
                    } else {
                        System.out.println("User not found. Deletion failed.");
                    }
                    break;
                case 4:
                    System.out.println("Searching for a user");
                    System.out.print("Enter the username to search for: ");
                    String usernameToSearch = sc.next();
                    User foundUser = userManagement.searchForUser(usernameToSearch);

                    if (foundUser != null) {
                        System.out.println("User found:");
                        System.out.println("Username: " + foundUser.getUsername() + ", Password: " + foundUser.getPassword());
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    System.out.println("Display all users");
                    userManagement.displayUsers();
                    break;

                case 6:
                    System.out.println("Returning to main menu");
                    displayMainMenu();
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    public static void studentInformationMenu(Scanner sc) {

        List<Student> studentList = new ArrayList<>();
        StudentManagement studentManagement = new StudentManagement(studentList);
        System.out.println("Student information menu");
        System.out.println("1. Add student");
        System.out.println("2. Update student details");
        System.out.println("3. Remove student");
        System.out.println("4. Search for student");
        System.out.println("5. Back to main menu");
        System.out.println("Please enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Adding a student");
                System.out.print("Enter the name: ");
                String name = sc.next();
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                System.out.println("Enter enrolled courses: ");
                String enrolledCourses = sc.nextLine();

                Student newStudent = new Student(name, id, enrolledCourses);

                StudentManagement.addStudent(newStudent);

                System.out.println("User added successfully.");
                break;
            case 2:
                System.out.println("Updating a student");
                System.out.print("Enter student id to update: ");
                int idToUpdate = sc.nextInt();
                Student studentToUpdate = studentManagement.searchForStudent(idToUpdate);

                if (studentToUpdate != null) {
                    System.out.print("Enter the new name: ");
                    String newName = sc.next();
                    System.out.print("Enter the new enrolled courses: ");
                    String newEnrolledCourses = sc.next();

                    studentManagement.updateStudentDetails(newName, idToUpdate, newEnrolledCourses);
                    System.out.println("Student details updated successfully.");
                } else {
                    System.out.println("Student not found. Update failed.");
                }
                break;

            case 3:
                System.out.println("Deleting student");
                System.out.print("Enter the id to delete: ");
                int idToDelete = sc.nextInt();
                Student studentToDelete = studentManagement.searchForStudent(idToDelete);

                if (studentToDelete != null) {
                    studentManagement.removeStudent(studentToDelete);
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Student not found. Deletion failed.");
                }
                break;

            case 4:
                System.out.println("Searching for a student");
                System.out.print("Enter the id to search for: ");
                int idToSearch = Integer.parseInt(sc.next());
                Student foundStudent = studentManagement.searchForStudent(idToSearch);
                if (foundStudent != null) {
                    System.out.println("Student found: ");
                    System.out.println("Name: " + foundStudent.getName() + ", Student ID: " + foundStudent.getStudentId() + "Enrolled courses: " + foundStudent.getEnrolledCourses());
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 5:
                System.out.println("Returning to main menu");
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again");
        }
    }

    public static void courseManagementMenu(Scanner sc, CourseManagement courseManagement) {

        System.out.println("Course management");
        System.out.println("1. Add a new course");
        System.out.println("2. Update a course");
        System.out.println("3. Remove for course");
        System.out.println("4. Search a course");
        System.out.println("5. Return to main menu");
        System.out.println("Please enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Adding a new course");
                System.out.print("Enter course name: ");
                String courseName = sc.next();
                System.out.print("Enter course id: ");
                int courseId = sc.nextInt();
                System.out.println("Enter enrolled students: ");
                String enrolledStudents = sc.nextLine();

                Course newCourse = new Course(courseName, courseId, enrolledStudents);

                CourseManagement.addNewCourse(newCourse);

                System.out.println("Course added successfully.");
                break;
            case 2:
                System.out.println("Updating a course");
                System.out.print("Enter course id to update: ");
                int idToUpdate = sc.nextInt();
                Course courseToUpdate = CourseManagement.searchForCourse(idToUpdate);

                if (courseToUpdate != null) {
                    System.out.print("Enter the new name: ");
                    String newCourseName = sc.next();
                    System.out.print("Enter the new enrolled students: ");
                    String newEnrolledStudents = sc.next();

                    CourseManagement.updateCourse(newCourseName, idToUpdate, newEnrolledStudents);
                    System.out.println("Course details updated successfully.");
                } else {
                    System.out.println("Course not found. Update failed.");
                }
                break;
            case 3:
                System.out.println("Searching for course");
                System.out.print("Enter the id to search for: ");
                int idToSearch = sc.nextInt();
                Course foundCourse = courseManagement.searchForCourse(idToSearch);
                if (foundCourse != null) {
                    System.out.println("Course found: ");
                    System.out.println("Course name: " + foundCourse.getCourseName() + " Course ID: " + foundCourse.getCourseID() + "Enrolled students: " + foundCourse.getEnrolledStudents());
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 4:
                System.out.println("Removing a course");
                System.out.print("Enter course id to remove: ");
                int courseIdToDelete = sc.nextInt();
                Course courseToDelete = courseManagement.searchForCourse(courseIdToDelete);

                if (courseToDelete != null) {
                    courseManagement.removeACourse(courseToDelete);
                    System.out.println("Course deleted successfully.");
                } else {
                    System.out.println("Course not found. Deletion failed.");
                }
                break;
            case 5:
                System.out.println("Returning to main menu");
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again");
        }
    }
}