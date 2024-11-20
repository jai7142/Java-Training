
import java.time.LocalDate;
import java.util.Scanner;

import inventroy.Inventory;
import models.Book;

public class LibraryManagementApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Inventory  inv = new Inventory();
        boolean running = true;
        while (running) {
            System.out.println("\nLibrary System Menu:");
            displayMenu();
            System.out.print("Choose an option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
            case 1: 
            	inv.addBook(new Book(String isbn, String title, String author, String publisher, boolean isAvailable, LocalDate issuedDate,
            			LocalDate dueDate)); break;
            case 2: 
            	inv.getBookByName(new String("")); break;
            case 3: inv.searchBooksByAuthor(new String("")); break;
            case 4: inv.searchBooksByPublisher(); break;
            case 5: inv.issueBook(); break;
            case 6: inv.returnBook(); break;
            case 7: inv.checkAvailability(); break;
            case 8: inv.listBorrowedBooks(); break;
            case 9: inv.renewBook(); break;
            case 10: inv.topBorrowers(); break;
            case 11: inv.popularBooks(); break;
            case 12: inv.updateBook(); break;
            case 13: inv.getAllBooks(); break;
            case 14: inv.getBooksByIssuedDate(); break;
            case 15: running = false; break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();  // Close scanner to avoid resource leak
    }

	public static void displayMenu() {
        System.out.println("\nLibrary Menu:");
        System.out.println("1) Add Book");
        System.out.println("2) Get Book by Name");
        System.out.println("3) Search Books by Author");
        System.out.println("4) Search Books by Publisher");
        System.out.println("5) Issue a Book");
        System.out.println("6) Return a Book");
        System.out.println("7) Check Availability");
        System.out.println("8) List Borrowed Books");
        System.out.println("9) Renew a Book");
        System.out.println("10) Top Borrowers");
        System.out.println("11) Popular Books");
        System.out.println("12) Update Book");
        System.out.println("13) Get All Books");
        System.out.println("14) Get Books by Issued Date");
        System.out.println("15) Exit");
    }
}
