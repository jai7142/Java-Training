package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import models.Book;
import models.User;
import repo.UserRepositoryImpl;

public class BookServiceImpl implements BookService {
	
	private List<User> users = new ArrayList<>();
	
	public static UserRepositoryImpl getInstance() {
		if (userRepositoryImpl == null) {
			userRepositoryImpl = new UserRepositoryImpl();
		}
		return userRepositoryImpl;

	}

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Book> getBookByName() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Book> searchBooksByAuthor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBooksByPublisher() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean issueBook(String isbn, User user, LocalDate dueDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean returnBook(String isbn, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBookAvailable(String isbn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> getBorrowedBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean renewBook(String isbn, User user, LocalDate newDueDate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getTopBorrowers(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getPopularBooks(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book updateBook(Book updatedBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByIssuedDate(LocalDate issuedDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
