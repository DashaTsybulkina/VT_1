package sort;

import module.Book;

import java.util.Comparator;

public class SortByAuthorAndNameAndPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int compare =  o1.getAuthor().compareTo(o2.getAuthor());
        if (compare == 0){
            compare = o1.getTitle().compareTo(o2.getTitle());
            if (compare ==0){
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        }
        return compare;
    }
}
