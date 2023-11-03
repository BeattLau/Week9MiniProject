package org.example;

import java.util.List;

public class UserManagement {
    private static List<User> userList;

    public UserManagement(List<User> userList) {
        this.userList = userList;
    }

    public void addUser(User user) {
        userList.add(user);
        System.out.println("User added successfully.");
    }

    public static void updateUser(String userName, String newPassword) {
        for (User user : userList) {
            if (user.getUsername().equals(userName)) {
                user.setPassword(newPassword);
                System.out.println("User updated successfully.");
                return;
            }
        }
        System.out.println("User not found. Update failed.");
    }


    public static void removeUser(User user) {
        userList.remove(user);
        System.out.println("User removed successfully.");
    }

    public static User searchForUser(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static void displayUsers() {
        System.out.println("All users: ");
        for (User user : userList) {
            System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword());
        }
    }
}
