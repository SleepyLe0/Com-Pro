package book;

public class BookP {
    private final int id;
    private static int lastestId;
    private final String name;
    private final String author;
    private double price;

    public BookP(String name, String author, double price) {
        id = lastestId++;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
