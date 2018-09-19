package controller;

public class BookManager {

    BookController bookController = new BookController();

    public void getAllBooks(){
        bookController.readAllBooks();
    }
}
