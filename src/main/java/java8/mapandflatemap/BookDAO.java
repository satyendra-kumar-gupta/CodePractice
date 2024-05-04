package java8.mapandflatemap;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){

        List<Book> books = new ArrayList<>();
        books.add(new Book(101, "Core Java", 400));
        books.add(new Book(102, "Hibernate", 100));
        books.add(new Book(103, "Spring", 100));
        books.add(new Book(104, "WebService", 100));

        return books;
    }
}
