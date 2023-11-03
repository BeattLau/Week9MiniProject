package org.example;

import java.util.Scanner;

public class CLIMenu {
    static UserRegistrationAndLogin userRegistration = new UserRegistrationAndLogin();
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while (true){
            displayMainMenu();
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("To user management menu");
                    userManagementMenu(sc);
                break;
                case 2:
                    System.out.println("To student information menu");
                    studentInformationMenu(sc);
                break;
                case 3:
                    System.out.println("To course management menu");
                    courseManagement(sc);
                break;
                case 4:
                    System.out.println("Exiting system");
                    System.exit(0);
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

    public static void userManagementMenu(Scanner sc){
        while (true){
            System.out.println("User Management menu: ");
            System.out.println("1. Add user");
            System.out.println("2. Update user");
            System.out.println("3. Delete user");
            System.out.println("4. Search for user");
            System.out.println("5. Back to main menu");
            System.out.println("Please enter your choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Adding a user");
                    userRegistration.registerUser(sc);
                break;
                case 2:
                    System.out.println("Updating a user");
                    updateUser(sc);
                break;
                case 3:
                    System.out.println("Deleting a user");
                    deleteUser(sc);
                break;
                case 4:
                    System.out.println("Searching for a user");
                    searchForUser(sc);
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

    public static void studentInformationMenu(Scanner sc){
        System.out.println("Student information menu");
        System.out.println("1. Add student");
        System.out.println("2. Update student details");
        System.out.println("3. Delete student");
        System.out.println("4. Back to main menu");
        System.out.println("Please enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Adding a student");
                userRegistration.registerUser(sc);
                break;
            case 2:
                System.out.println("Updating a student");
                updateStudentDetails(sc);
                break;
            case 3:
                System.out.println("Deleting a student");
                deleteStudent(sc);
                break;
            case 4:
                System.out.println("Searching for a student");
                searchForStudent(sc);
                break;
            case 5:
                System.out.println("Returning to main menu");
                displayMainMenu();
                break;
            default:
                System.out.println("Invalid choice, please try again");
        }
    }

    public static void courseManagement(Scanner sc){
        System.out.println("Course management");
        System.out.println("1. View current courses");
        System.out.println("2. Add a new course");
        System.out.println("3. Search for course");
        System.out.println("4. Return to main menu");
        System.out.println("Please enter your choice: ");
      int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Viewing current courses");
                displayCurrentCourses(sc);
                break;
            case 2:
                System.out.println("Adding a new course");
                addNewCourse(sc);
                break;
            case 3:
                System.out.println("Search for a course");
                searchForCourse(sc);
                break;
            case 4:
                System.out.println("Deleting a course");
                deleteACourse(sc);
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
}