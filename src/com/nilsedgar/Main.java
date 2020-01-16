package com.nilsedgar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Harry Potter", "JK Rowling", "Fantasy"));
        books.add(new Book("Lord Of The Rings", "J.R.R Tolkien", "Fantasy"));

        FileUtility.saveObject("books.ser", books);

    }
}
