package Advanced2.BookLibrary.model;

import Advanced2.BookLibrary.factory.BookFactory;
import Advanced2.BookLibrary.factory.PersonFactory;

import java.util.HashSet;
import java.util.Set;

public class Database {

    private Set<Book> books;
    private Set<Person> persons;

    private BookFactory bookfactory = new BookFactory();
    private PersonFactory personfactory = new PersonFactory();

    public Database(){
        books = new HashSet<>();
        persons = new HashSet<>();

        /*Book book = new Book();
        book.setAuthor("Duma");
        book.setAuthor("10 years later");
        book.setId(1);

        Book book2 = new Book();
        book2.setAuthor("Tolkien");
        book2.setAuthor("Two towers");
        book2.setId(2);

        Book book3 = new Book();
        book3.setAuthor("Tolkien");
        book3.setAuthor("Return to the king");
        book3.setId(3);*/

        // as we created factory, comment out or delete previous and use factory
        Book book = bookfactory.createBook(1,"10 years later","Duma");
        Book book2 = bookfactory.createBook(2,"Two towers","Tolkien");
        Book book3 = bookfactory.createBook(3,"return to the king","Tolkien");
        // add books to database
        books.add(book);
        books.add(book2);
        books.add(book3);

        //now same with persons
        Person person = personfactory.createPerson(1,12,"John");
        Person person2 = personfactory.createPerson(3,44,"Timothy");

        persons.add(person);
        persons.add(person2);

    }

    public Book getBookById(long id){
        for (Book book : books){
            if (book.getId() == id){
                return book;
            }
        }
        throw new RuntimeException("No books found with id: " + id);
    }

    public Person getPersonById(long id){
        for (Person person : persons){
            if (person.getId() == id){
                return person;
            }
        }
        throw new RuntimeException("No persons found with id: " + id);
    }



    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }
}
