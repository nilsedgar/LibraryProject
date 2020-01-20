package com.nilsedgar;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    Menu menu = new Menu();

    public Program() {

        //menu.showMainMenu();
        createUserList();


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

}





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
