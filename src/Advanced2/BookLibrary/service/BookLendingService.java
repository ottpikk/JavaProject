package Advanced2.BookLibrary.service;

import Advanced2.BookLibrary.model.Book;
import Advanced2.BookLibrary.model.Person;

import java.sql.Date;

public class BookLendingService {


    public static final int TWO_WEEKS = 3600 * 24 * 14 * 1000;

    public void reserveBook(Book book, Person person) {
        if(book.getPerson() != null){
            throw new RuntimeException("Book: " + book.getTitle()
            + "already reserved");
        }
        book.setPerson(person);
        book.setUntil(new Date(System.currentTimeMillis()+ TWO_WEEKS));
    }

    public void returnBook(Book book){
        book.setPerson(null);
        book.setUntil(null);
    }
}
