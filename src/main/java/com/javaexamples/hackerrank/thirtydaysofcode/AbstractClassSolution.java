package com.javaexamples.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class AbstractClassSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}


abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    private final int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

/**
 * Class Constructor
 *
 * @param title The book's title.
 * @param author The book's author.
 * @param price The book's price.
 * <p>
 * Method Name: display
 * <p>
 * Print the title, author, and price in the specified format.
 **/
// Write your constructor here

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
// Write your method here

// End class

