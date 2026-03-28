package model;

public abstract class LibraryItem {
    protected int id;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public abstract void displayDetails();

    public void borrowItem() {
        isAvailable = false;
    }

    public void returnItem() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}