package view;

import model.Book;

import java.util.List;

public class BookView {
    public void displayAllBooks(List<Book> collectionsOfBooks) {

        int n = 1;
        for(Book book: collectionsOfBooks){
             System.out.println(n + ". " + book.toString());
             n++;
         }

    }
}
