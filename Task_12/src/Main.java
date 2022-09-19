import module.Book;
import sort.SortByAuthorAndName;
import sort.SortByAuthorAndNameAndPrice;
import sort.SortByName;
import sort.SortByNameAndAuthor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("title", "author" , 12 );
        Book book2 = new Book("title", "author" , 12 );
        Book book3 = new Book("title1", "author" , 13 );
        Book book4 = new Book("title1", "authorFirst" , 130 );
        Book book9 = new Book("title1", "jdfe" , 130 );
        Book book5 = new Book("title2", "authorSecond" , 136 );
        Book book8 = new Book("title2", "authorSecond" , 123 );
        Book book6 = new Book("title3", "authorThird" , 189 );
        Book book7 = new Book("title4", "authorFourth" , 1123 );
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book);

        ArrayList<Book> arr = new ArrayList();
        arr.add(book4);
        arr.add(book5);
        arr.add(book6);
        arr.add(book7);
        arr.add(book8);
        arr.add(book9);
        arr.sort(new SortByNameAndAuthor());
        System.out.println(arr);
        arr.sort(new SortByName());
        System.out.println(arr);
        arr.sort(new SortByAuthorAndName());
        System.out.println(arr);
        arr.sort(new SortByAuthorAndNameAndPrice());
        System.out.println(arr);
    }
}