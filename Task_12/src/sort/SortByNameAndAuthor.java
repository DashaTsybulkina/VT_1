package sort;

import module.Book;

import java.util.Comparator;

public class SortByNameAndAuthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compare =  o1.getTitle().compareTo(o2.getTitle());
        if (compare == 0){
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
        return compare;
    }
}
