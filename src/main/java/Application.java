import controller.BookManager;

public class Application {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        System.out.println("All books");
        bookManager.getAllBooks();
    }
}
