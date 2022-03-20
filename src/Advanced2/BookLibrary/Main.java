package Advanced2.BookLibrary;

import Advanced2.BookLibrary.model.Database;
import Advanced2.BookLibrary.service.BookLendingService;
import Advanced2.BookLibrary.service.ReportService;

public class Main {
    public static void main(String[] args) {
        //Create database and services
        Database database = new Database();
        ReportService reportService = new ReportService(database);
        BookLendingService bookLendingService = new BookLendingService();

        //Reserve a book
        bookLendingService.reserveBook(database.getBookById(1), database.getPersonById(1));
        bookLendingService.reserveBook(database.getBookById(2), database.getPersonById(1));

        //Return book
        bookLendingService.returnBook(database.getBookById(1));


        // Printout all/available and reserved books
        String allBooks = reportService.displayAllBooks().toString();
        String availableBooks = reportService.displayAvailableBooks().toString();
        String reservedBooks = reportService.displayReservedBooks().toString();

        System.out.println("\nAll books in library:\n" + allBooks);
        System.out.println("\nAvailable books:\n" + availableBooks);
        System.out.println("\nReserved books:\n" + reservedBooks);








    }
}
