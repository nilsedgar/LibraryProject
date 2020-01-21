package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public Program() {

        Menu menu = new Menu();
        menu.showMainMenu();


    }

    public void addNewBook(){
        System.out.println("Enter title: ");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter author: ");
        String bookAuthor = scanner.nextLine();
        System.out.println("Enter genre: ");
        String bookGenre = scanner.nextLine();
        books.add(new Book(bookTitle, bookAuthor, bookGenre, true));
    }

    public void addNewCustomer(){
        System.out.println("Enter name:");
        String customerName = scanner.nextLine();
        users.add(new Customer(customerName, "customer123"));
    }

    public void showAllUsers(){
        for(User user: users){
            System.out.println(user.getName());
        }
    }

    public void searchForUserName(){
        System.out.println("Enter name: ");
        String nameSearch = scanner.nextLine();
        for(User user: users){
            if(user.getName().equals(nameSearch)){
                System.out.println("There is a user by that name");
            }
            else{
                System.out.println("Could not find user");
            }
        }
    }

    public void createUserList() {
        users.add(new Admin("Nils Jacobsen", "admin123"));
        users.add(new Admin("Karin Lennebo", "admin123"));
        users.add(new Customer("Hej Hejsson", "customer123"));
        users.add(new Customer("Adjö Adjösson", "customer123"));
        users.add(new Customer("Läget Lägetsson", "customer123"));
        users.add(new Customer("Låna Boksson", "customer123"));

        FileUtility.saveObject("users.ser", users);
    }


    public void createBookList() {

        books.add(new Book("Harry Potter", "JK Rowling", "Fantasy", true));
        books.add(new Book("Lord Of The Rings", "J.R.R Tolkien", "Fantasy", true));
        books.add(new Book("Moby Dick", "Herman Melville", "Drama", true));
        books.add(new Book("Hamlet", "William Shakespeare", "Tragedy", true));
        books.add(new Book("Huckleberry Finn", "Mark Twain", "Adventure", true));
        books.add(new Book("Pride and Prejudice", "Jane Austen", "Periodical", true));
        books.add(new Book("The Iliad", "Homer", "Epic", true));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee", "Gothic", true));

        FileUtility.saveObject("books.ser", books);
    }
}