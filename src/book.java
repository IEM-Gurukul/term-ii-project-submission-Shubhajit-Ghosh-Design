package model;

public class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book ID: " + id + ", Title: " + title +
                ", Author: " + author + ", Available: " + isAvailable);
    }
}