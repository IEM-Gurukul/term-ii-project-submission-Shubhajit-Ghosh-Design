package model;

public class Magazine extends LibraryItem {
    private String category;

    public Magazine(int id, String title, String category) {
        super(id, title);
        this.category = category;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine ID: " + id + ", Title: " + title +
                ", Category: " + category + ", Available: " + isAvailable);
    }
}