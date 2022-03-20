package Advanced2.BookLibrary.service;

import Advanced2.BookLibrary.model.Book;
import Advanced2.BookLibrary.model.Database;

import java.util.HashSet;
import java.util.Set;

public class ReportService {

    private Database database;

    //constructor
    public ReportService(Database database){
        this.database = database;
    }

    //Methods
    public Set<Book> displayAllBooks(){
        return database.getBooks();
    }

    public Set<Book> displayAvailableBooks(){
        /*  return database.getBooks().stream()
                .filter(t ->
                        t.getPerson() == null
                ).collect(Collectors.toSet());
        */

        //get all books
        Set<Book> allBooks = database.getBooks();
        //create temp set for free books
        Set<Book> availableBooks = new HashSet<>();
        //loop through books, if person == null add to availableBooks Set
        for (Book book : allBooks ) {
            if (book.getPerson() == null){
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    //reservedBooks basically same only !=null
    public Set<Book> displayReservedBooks(){
        Set<Book> allBooks = database.getBooks();
        Set<Book> reservedBooks = new HashSet<>();
        for (Book book : allBooks ) {
            if (book.getPerson() != null){
                reservedBooks.add(book);
            }
        }
        return reservedBooks;
    }

}
