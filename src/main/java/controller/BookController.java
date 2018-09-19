package controller;

import dao.BookDao;
import dao.CSVBookDao;
import model.Book;
import view.BookView;

import java.util.ArrayList;
import java.util.List;

public class BookController {

    private BookDao bookDao = new CSVBookDao();
    private BookView bookView = new BookView();

    public void readAllBooks() {
        List<Book>collectionsOfBooks = bookDao.getAllBooks();
        bookView.displayAllBooks(collectionsOfBooks);


    }
}
