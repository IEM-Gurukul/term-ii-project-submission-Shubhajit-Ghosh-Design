package service;

import model.*;
import exception.BookNotAvailableException;

import java.util.*;

public class LibraryService {
    private List<LibraryItem> items = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private Map<Integer, Integer> issuedBooks = new HashMap<>();

   
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    
    public void registerMember(Member member) {
        members.add(member);
    }

    
    public void searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.displayDetails();
            }
        }
    }

    
    public void borrowItem(int itemId, int memberId) throws BookNotAvailableException {
        for (LibraryItem item : items) {
            if (item.getId() == itemId) {
                if (!item.isAvailable()) {
                    throw new BookNotAvailableException("Book is not available!");
                }
                item.borrowItem();
                issuedBooks.put(itemId, memberId);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

   
    public void returnItem(int itemId) {
        for (LibraryItem item : items) {
            if (item.getId() == itemId) {
                item.returnItem();
                issuedBooks.remove(itemId);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    
    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
        }
    }
}