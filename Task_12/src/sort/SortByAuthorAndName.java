package sort;

import module.Book;

import java.util.Comparator;

public class SortByAuthorAndName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compare =  o1.getAuthor().compareTo(o2.getAuthor());
        if (compare == 0){
            return o1.getTitle().compareTo(o2.getTitle());
        }
        return compare;
    }
}
