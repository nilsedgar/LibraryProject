package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        private String password = "password123";

    public Program(){

        showMainMenu();

    }

    public void showMainMenu(){
        boolean active = true;
        int selection = scanner.nextInt();
        System.out.println("Welcome to the Library");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Customer");
        System.out.println("3. Exit");

        while(active){
            switch (selection){
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
        switch (select){
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
        System.out.println("Enter password:");
        String pass = scanner.nextLine();
        if(pass.equals(password)) {
            showAdminMenu();
        }
        else{
            System.out.println("Incorrect password");
        }
    }

    private void showAdminMenu() {
        int select = scanner.nextInt();
        System.out.println("1. Add new book");
        System.out.println("2. Add new customer");
        System.out.println("3. Show all users");
        System.out.println("4. Search for users");
        System.out.println("5. Return to main menu");
        switch (select){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                showMainMenu();
        }
    }

}

//        users.add(new Admin("Nils Jacobsen", true));
//        users.add(new Admin("Karin Lennebo", true));
//        users.add(new Customer("Hej Hejsson", false));
//        users.add(new Customer("Adjö Adjösson", false));
//        users.add(new Customer("Läget Lägetsson", false));
//        users.add(new Customer("Låna Boksson", false));
//
//        FileUtility.saveObject("users.ser", users);

//            books.add(new Book("Harry Potter", "JK Rowling", "Fantasy"));
//            books.add(new Book("Lord Of The Rings", "J.R.R Tolkien", "Fantasy"));
//            books.add(new Book("Moby Dick", "Herman Melville", "Drama"));
//            books.add(new Book("Hamlet", "William Shakespeare", "Tragedy"));
//            books.add(new Book("Huckleberry Finn", "Mark Twain", "Adventure"));
//            books.add(new Book("Pride and Prejudice", "Jane Austen", "Periodical"));
//            books.add(new Book("1984", "George Orwell", "Dystopia"));
//            books.add(new Book("The Iliad", "Homer", "Epic"));
//            books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Gothic"));
//
//
//            FileUtility.saveObject("books.ser", books);
