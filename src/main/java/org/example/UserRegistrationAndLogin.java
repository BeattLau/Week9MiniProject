package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistrationAndLogin {

    private List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        UserRegistrationAndLogin app = new UserRegistrationAndLogin();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    app.registerUser(sc);
                    break;
                case 2:
                    app.loginUser(sc);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    private void registerUser(Scanner scanner) {
        System.out.print("Enter a username: ");
        String username = scanner.next();
        System.out.print("Enter a password: ");
        String password = scanner.next();

        User newUser = new User(username, password);
        users.add(newUser);

        System.out.println("User registered successfully!");
    }


    private void loginUser(Scanner scanner) {
        System.out.print("Enter your username: ");
        String username = scanner.next();
        System.out.print("Enter your password: ");
        String password = scanner.next();

        boolean isAuthenticated = false;

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                isAuthenticated = true;
                break;
            }
        }

        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
    }
}

