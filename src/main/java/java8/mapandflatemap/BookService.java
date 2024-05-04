package java8.mapandflatemap;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {

    public static void main(String[] args) {
        System.out.println( new BookService().getBooksSort());
    }

    public List<Book> getBooksSort(){
        List<Book> books = new BookDAO().getBooks();
//        Collections.sort(books,new MyComparator());

        Collections.sort(books,(o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }
}

//class MyComparator implements Comparator<Book> {
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o2.getName().compareTo(o1.getName());
//    }
//}
