package dao;

import model.Book;

import java.util.List;

public interface BookDao {

    void addBook(Book book);
    List<Book> getAllBooks();
    void updateBook(Book book);
    void deleteBook(Book book);
}
