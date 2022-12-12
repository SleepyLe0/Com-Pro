package store;

import book.BookP;

import java.util.Arrays;

public class BookStoreP {

    private int id;
    private static int lastestId;
    private String name;
    private BookP[] books;
    private int size;

    public BookStoreP(String name, int size) {
        id = lastestId++;
        this.name = name;
        this.size = size;
        books = new BookP[size];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BookP[] getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addBook(BookP book) {
        int bId = (int)(Math.random()*(size-1));
        if (books[bId] == null) {
            books[bId] = book;
            return true;
        }else {
            return false;
        }
    }

    public boolean sellBook(int id) {
        if (books[id] != null) {
            books[id] = null;
            return true;
        }else {
            return false;
        }
    }

    public BookP[] getAllBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "BookStoreP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", size=" + size +
                '}';
    }
}
