package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        boolean active = true;
        int selection = scanner.nextInt();
        System.out.println("Welcome to the Library");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Customer");
        System.out.println("3. Exit");

        while (active) {
            switch (selection) {
                case 1:
                    loginAsAdmin();
                case 2:
                    showCustomerMenu();
                case 3:
                    active = false;
            }
        }
    }

    private void showCustomerMenu() {
        int select = scanner.nextInt();
        System.out.println("1. Show list of all books");
        System.out.println("2. Show info on book");
        System.out.println("3. Borrow a book");
        System.out.println("4. Search titles");
        System.out.println("5. Search authors");
        System.out.println("6. Show my borrowed books");
        System.out.println("7. Return books");
        System.out.println("8. Return to main menu");
        switch (select) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                showMainMenu();
        }

    }

    private void loginAsAdmin() {
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String pass = scanner.nextLine();

        ArrayList<User> users = (ArrayList<User>) FileUtility.loadObject("users.ser");

        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(pass)){
                showAdminMenu();
                break;
            }
        }

    }

    private void showAdminMenu() {
        int select = scanner.nextInt();
        System.out.println("1. Add new book");
        System.out.println("2. Add new customer");
        System.out.println("3. Show all users");
        System.out.println("4. Search for users");
        System.out.println("5. Return to main menu");
        switch (select) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                showMainMenu();
        }
    }

}
