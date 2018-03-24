/*created by Mohamed Khalefa
 * MIT Open Courseware
 * Intro to Programming in Java
 *
 * Assignment 4: Library
 * This file is a class that simulates a book at a library.
 *
 * Assignments can be found at the following link:
 * http://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-092-introduction-to-programming-in-java-january-iap-2010/index.htm
 */
import java.util.*;

import java.util.ArrayList;

public class Books {
    String title;
    boolean borrowed;

    // Creates a new Book
    public Books(String bookTitle){
        // Implement this method
        title = bookTitle ;
    }

    // Marks the book as rented
    public void borrowed() {
        // Implement this method
        borrowed = true ;
    }

    // Marks the book as not rented
    public void returned() {
        // Implement this method
        borrowed = false ;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        // Implement this method
    if (borrowed) {
        return true ;}
        return false ;
    }

    // Returns the title of the book
    public String getTitle() {
        // Implement this method

return title ;
    }






    public static void main(String[] arguments) throws Exception { // Small test of the Book class
         Books example = new Books("The Da Vinci Code");


        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.borrowed();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }


}

