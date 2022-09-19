import module.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("title", "author" , 12 );
        Book book2 = new Book("title", "author" , 12 );
        Book book3 = new Book("title1", "author" , 13 );
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book);
    }
}