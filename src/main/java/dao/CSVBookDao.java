package dao;

import model.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVBookDao implements BookDao {

    public void addBook(Book book) {

    }

    public List<Book> getAllBooks() {
        return loadBooksFromSCV();
    }

    public void updateBook(Book book) {

    }

    public void deleteBook(Book book) {

    }

    private List<Book> loadBooksFromSCV() {
        List<String>csvLines = readFile("books.csv");
        return convertCSVLinesIntoObjects(csvLines);
    }

    private List<Book> convertCSVLinesIntoObjects(List<String> csvLines) {
        List<Book> bookCollections = new ArrayList<Book>();

        for(String lines:csvLines){
            Book book = createBookObject(lines);
            bookCollections.add(book);
        }
        return bookCollections;
    }

    private Book createBookObject(String lines) {
        String[] bookInfo = lines.split(",");
        String title = bookInfo[0];
        String author = bookInfo[1];
        String originalLanguage = bookInfo[2];
        String firstPublished = bookInfo[3];
        String approximateSales = bookInfo[4];
        String genre = bookInfo[5];

        return new Book(title,author,originalLanguage,Integer.parseInt(firstPublished),
                Integer.parseInt(approximateSales), genre);
    }

    private List<String> readFile(String filename) {
        List<String> lines = new ArrayList<String>();

        File homedir = new File(System.getProperty("user.dir"));
        File path = new File(homedir, "/src/main/resources/csv/"+filename);

        try {
            File file = new File(path.toString());
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lines;
    }
}
