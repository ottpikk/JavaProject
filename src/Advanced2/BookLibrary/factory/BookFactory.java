package Advanced2.BookLibrary.factory;

import Advanced2.BookLibrary.model.Book;

public class BookFactory {

    public Book createBook(long id, String title, String author){
        Book book = new Book();
        book.setId(id);
        book.setAuthor(author);
        book.setTitle(title);
        return book;
    }
}
