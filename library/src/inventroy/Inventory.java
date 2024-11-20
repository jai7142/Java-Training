package inventroy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import exception.AlreadyIssuedException;
import exception.ISBNAlreadyExistsException;
import models.Book;
import models.User;


public class Inventory {
	public List<Book> books = new ArrayList<>();
	private Map<User, Integer> userBorrowCount = new HashMap<>();
	private Map<Book, Integer> bookBorrowCount = new HashMap<>();
	// it is advisable to use userId as key for this map
	public Map<String, User> users = new HashMap<>();
	  private Map<String, Book> bookCatalog  = new HashMap<>();; 

	public void addBook(Book book) throws ISBNAlreadyExistsException {
		// write your code here
		if(!books.isEmpty()){
		for(Book book1 : books) {
			if(book1.getIsbn().equals(book.getIsbn())) {
				throw new ISBNAlreadyExistsException("Duplicate I S B N Found");
			}else{
				books.add(book);
				break;
			}
		}
	}else{
		books.add(book);
	}
		
	}

	public Optional<Book> getBookByName(String name) {
		// Validate the input to avoid unnecessary searches
		if (name == null || name.trim().isEmpty()) {
			return Optional.empty();  // Return empty if the name is null or empty
		}
		if(!users.isEmpty()){
		for (Entry<String, User> entry : users.entrySet()) {
			List<Book> books = entry.getValue().getBorrowedBooks();
				for(Book a : books){
					if(a.getTitle().equals(name)){
							throw new AlreadyIssuedException("Already Issued");
					}
				}
		
		}
	}
		// Iterate through the books list to find a match
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(name)) {
				return Optional.of(book);  // Return the book wrapped in Optional if found
			}
		}
	
		// Return Optional.empty() if no matching book is found
		return Optional.empty();
	}
 
	public List<Book> searchBooksByAuthor(String author) {
		// List to store books that match the author
		List<Book> matchingBooks = new ArrayList<>();
	
		// Loop through all books and check if the author matches
		for (Book book : books) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				matchingBooks.add(book);  // Add to matchingBooks list
			}
		}
	
		// Return the list of books that matched the author
		return matchingBooks;
	}
	public List<Book> searchBooksByPublisher(String publisher) {
		// List to store books that match the publisher
		List<Book> matchingBooks = new ArrayList<>();
	
		// Loop through all books and check if the publisher matches
		for (Book book : books) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				matchingBooks.add(book);  // Add to matchingBooks list
			}
		}
	
		// Return the list of books that matched the publisher
		return matchingBooks;
	}
	public Book updateBook(Book updatedBook) {
        // Iterate over the books to find the book with the same ISBN
        for (Book book : books) {
            if (book.getIsbn().equals(updatedBook.getIsbn())) {
                // Update the book's details
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());

                System.out.println("Updated book: " + book);
                return book; // Return the updated book
            }
        }
		return null;
	}

	public List<Book> getAllBooks() {
		// write your code here
		return books;
	}

	public List<Book> getBooksByIssuedDate(LocalDate issuedDate) {
		// write your code here
		 List<Book> booksAu = new ArrayList<>();
			for(Book book : books) {
				if(book.getIssuedDate().equals(issuedDate)) {
					booksAu.add(book);
				}
			}
			return booksAu;
	}

	public boolean issueBook(String isbn, User user, LocalDate dueDate) {
		if(users.containsKey(user.getUserId())) {
			List<Book> test = users.get(user.getUserId()).getBorrowedBooks();
			for(Book te : test) {
				if(te.getIsbn().equals(isbn)) {
					te.setDueDate(dueDate);
					test.add(te);
					users.get(user.getUserId()).setBorrowedBooks(test);
					return true;
				}
			}
		}
		return false;
	}

	public boolean returnBook(String isbn, User user) {
        // Check if the user exists in the system
        if (users.containsKey(user.getUserId())) {
            List<Book> borrowedBooks = users.get(user.getUserId()).getBorrowedBooks();
            
            // Use an iterator to safely remove the book from the borrowed books list
            Iterator<Book> iterator = borrowedBooks.iterator();
            while (iterator.hasNext()) {
                Book book = iterator.next();
                
                // Check if the current book's ISBN matches the provided ISBN
                if (book.getIsbn().equals(isbn)) {
                    // Remove the book from the borrowed list
                    iterator.remove();
                    
                    // Mark the book as available (if applicable)
                    // Assuming the Book class has an isAvailable method:
                    book.setAvailable(true);
                    
                    // Optionally, you can also update any other systems like a records database or logs
                    return true; // Successfully returned the book
                }
            }
        }
        
        // If no matching book is found or user doesn't exist, return false
        return false;
    }

	public boolean isBookAvailable(String isbn) {
		// write your code here
		boolean b = false;
		
		for(Book book : books) {
			if(book.getIsbn().equals(isbn)) {
				b = true;
				break;
			}else{
				b = false;
				break;
			}
		}
	
		return b;
	}

	public List<Book> getBorrowedBooks() {
		// write your code here
		 Set<Book> bList = new HashSet<>();
		 for (Entry<String, User> entry : users.entrySet()) {
			 List<Book> books = entry.getValue().getBorrowedBooks();
				 bList.addAll(books);
		 
		 }
		return new ArrayList<>(bList);
	}
	
	public boolean renewBook(String isbn, User user, LocalDate newDueDate) {
		   Book book = bookCatalog.get(isbn);
	        
	        if (book != null && user.hasBorrowedBook(book)) {
	            LocalDate currentDueDate = book.getDueDate();
	            if (newDueDate.isAfter(currentDueDate)) {
	                book.setDueDate(newDueDate);  // Update the due date
	                return true;
	            } 
	        }
	        
	        return false;
	}

	public List<User> getTopBorrowers(int count) {
		// write your code here
		
		 List<Map.Entry<User, Integer>> entryList = new ArrayList<>(userBorrowCount.entrySet());

	        // Sort the list by the number of books borrowed in descending order
	        entryList.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

	        // Create a list of the top 'count' users
	        List<User> topBorrowers = new ArrayList<>();
	        for (int i = 0; i < count && i < entryList.size(); i++) {
	            topBorrowers.add(entryList.get(i).getKey());
	        }

	        return topBorrowers;
	}

	public List<Book> getPopularBooks(int count) {
		 List<Map.Entry<Book, Integer>> entryList = new ArrayList<>(bookBorrowCount.entrySet());

	        // Sort the list by the number of times the book has been borrowed (in descending order)
	        entryList.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

	        // Create a list of the top 'count' popular books
	        List<Book> popularBooks = new ArrayList<>();
	        for (int i = 0; i < count && i < entryList.size(); i++) {
	            popularBooks.add(entryList.get(i).getKey());
	        }

	        return popularBooks;
	}

	public User getUserById(String userId) {
		// write your code here
		return users.get(userId);
	}

	public Map<String, User> getUsers() {
		// write your code here
		
		
		return users;
	}
}