package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import models.Book;
import models.User;

public interface BookService {
	
	public void addBook(Book book);
	public Optional<Book> getBookByName();
	public List<Book> searchBooksByAuthor();
	public List<Book> searchBooksByPublisher();
	public boolean issueBook(String isbn, User user, LocalDate dueDate);
	public boolean returnBook(String isbn, User user);
	public boolean isBookAvailable(String isbn);
	public List<Book> getBorrowedBooks();
	public boolean renewBook(String isbn, User user, LocalDate newDueDate);
	public List<User> getTopBorrowers(int count);
	public List<Book> getPopularBooks(int count) ;
	public Book updateBook(Book updatedBook);
	public List<Book> getAllBooks();
	public List<Book> getBooksByIssuedDate(LocalDate issuedDate);
	
	

}
