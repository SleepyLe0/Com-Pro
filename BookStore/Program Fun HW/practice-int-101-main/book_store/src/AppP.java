import book.BookP;
import java.util.Arrays;
import store.BookStoreP;

public class AppP {

    public static void main(String[] args) throws Exception {
        testBook();
        testStore();
        testStoreAddBook();
        testStoreRemoveBook();
        testStoreGetAllBooks();
    }

    private static void testBook() {
        BookP book = new BookP("Harry Panner", "JJ. Ablamham", 999);
        System.out.println(book);
        System.out.println("===========");
    }

    private static void testStore() {
        BookStoreP store = new BookStoreP("Comic Book Stores", 10);
        System.out.println(store);
        System.out.println("===========");
    }

    private static void testStoreAddBook() {
        BookStoreP store = new BookStoreP("9In", 10);
        for (int i = 0; i <= 3; i++) {
            BookP book = new BookP("A" + i, "" + i, i * 100);
            store.addBook(book);
        }
        System.out.println(store);
        System.out.println("===========");
    }

    private static void testStoreRemoveBook() {
        BookStoreP store = new BookStoreP("9In", 10);
        for (int i = 0; i <= 3; i++) {
            BookP book = new BookP("A" + i, "" + i, i * 100);
            store.addBook(book);
            store.sellBook(book.getId());
        }
        System.out.println(store);
        System.out.println("===========");
    }

    private static void testStoreGetAllBooks() {
        BookStoreP store = new BookStoreP("9In", 10);
        for (int i = 0; i <= 10; i++) {
            BookP book = new BookP("A" + i, "" + i, i * 100);
            store.addBook(book);
        }
        System.out.println(Arrays.toString(store.getAllBooks()));
        System.out.println("===========");
    }
}