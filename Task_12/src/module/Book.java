package module;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(title, book.title)&& Objects.equals(author, book.author) && price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                " title='" + title +
                ", author='" + author +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() {
        Book clone = new Book(author, title, price);
        return clone;
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
