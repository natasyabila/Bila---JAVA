package org.example;

import java.util.Scanner;

public class Main {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int option;

        while (isRunning) {
            System.out.println("\n==== Library System ====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    loginAsStudent(scanner);
                    break;
                case 2:
                    loginAsAdmin(scanner);
                    break;
                case 3:
                    System.out.println("adios");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void loginAsStudent(Scanner scanner) {
        System.out.print("Enter your NIM: ");
        String nim = scanner.next();

        if (nim.length() != 15) {
            System.out.println("User Not Found");
        } else {
            System.out.println("Successful Login as Student");
        }
    }

    private static void loginAsAdmin(Scanner scanner) {
        System.out.print("Enter your username (admin): ");
        String username = scanner.next();

        System.out.print("Enter your password (admin): ");
        String password = scanner.next();

        if (!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD)) {
            System.out.println("Admin User Not Found!!");
        } else {
            System.out.println("Successful Login as Admin");
        }
    }
}
