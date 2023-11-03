package org.example;
import java.io.*;
import java.util.Scanner;

public class ReadAndWriteToFile {
    public static void main(String[] args) {
        String fileNameUser = "src/main/java/org/example/currentUser";
        String fileNameStudent = "src/main/java/org/example/studentData";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your user name or type exit to leave: ");
        String input = sc.nextLine();

        if (input.equals("exit")) {
            System.exit(0);
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameUser))) {
            bw.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Username has been updated.");

        System.out.println("Please enter the student data or type exit to leave: ");
        String input2 = sc.nextLine();

        if (input2.equals("exit")) {
            System.exit(0);
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameStudent))) {
            bw.write(input2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Student data has been updated.");
    }
}
