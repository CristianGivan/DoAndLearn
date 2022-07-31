package Projects.Library;

import java.util.Scanner;

public class Book {

    private String name;
    private String author;
    private String isbn;
    private int numberOfCopies;
    private int numberOfBooksBorrowed;
    //private String[][] borrowersNames; //[numele celui care a imprumutato][statusul imrumutata sau restituita] in case is needed to have the lest 100 users that borrowed the book

    public Book(String name, String author, String isbn, int numberOfCopies, int numberOfBooksBorrowed) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.numberOfCopies = numberOfCopies;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }

    public Book(Scanner console) {
        System.out.println("Insert the name of the book: ");
        this.name = console.nextLine();
        System.out.println("Insert the author of the book: ");
        this.author = console.nextLine();
        System.out.println("Insert the ISBN of the book: ");
        this.isbn = console.nextLine();
        System.out.println("Insert the number of copies for the book: ");
        this.numberOfCopies = console.nextInt();
        this.numberOfBooksBorrowed = 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                ", numberOfBooksBorrowed=" + numberOfBooksBorrowed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getNumberOfBooksBorrowed() {
        return numberOfBooksBorrowed;
    }

    public void setNumberOfBooksBorrowed(int numberOfBooksBorrowed) {
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;
    }
///////////////////////////////////


    public void borrowBook(String ISBN) {

    }

    public void returnBook(String ISBN) {

    }

}
