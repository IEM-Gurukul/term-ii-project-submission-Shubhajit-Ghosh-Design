import model.*;
import service.LibraryService;
import exception.BookNotAvailableException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();
        Scanner sc = new Scanner(System.in);

        
        library.addItem(new Book(1, "Java Programming", "James Gosling"));
        library.addItem(new Magazine(2, "Tech Today", "Technology"));

        library.registerMember(new Member(101, "Alice"));

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. View Items");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    library.displayAllItems();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    library.searchByTitle(title);
                    break;

                case 3:
                    System.out.print("Enter Item ID: ");
                    int itemId = sc.nextInt();
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();

                    try {
                        library.borrowItem(itemId, memberId);
                    } catch (BookNotAvailableException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    int returnId = sc.nextInt();
                    library.returnItem(returnId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}