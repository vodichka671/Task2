package controller;
import model.Book;
import java.util.Comparator;

public  class BooksAuthorComparator implements Comparator {
    public int compare(Object o1, Object o2){
        Book b1 = (Book)o1;
        Book b2 = (Book)o2;

        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
