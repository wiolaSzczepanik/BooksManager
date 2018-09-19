package model;

public class Book {
    private String title;
    private String author;
    private String originalLanguage;
    private int firstPublished;
    private int approximateSales;
    private String genre;

    public Book(String title, String author, String originalLanguage, int firstPublished, int approximateSales, String genre) {
        this.title = title;
        this.author = author;
        this.originalLanguage = originalLanguage;
        this.firstPublished = firstPublished;
        this.approximateSales = approximateSales;
        this.genre = genre;
    }

    @Override
    public String toString() {

        return String.format("Title: %s, Author: %s, Language: %s, First published: %d, Sales[millions]: %d, Genre: %s",
                title, author, originalLanguage, firstPublished, approximateSales, genre);
    }
}
