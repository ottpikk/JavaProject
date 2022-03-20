package Advanced2.BookLibrary.model;

import java.util.Date;

public class Book {

    private long id;
    private String title;
    private String author;
    private Person person;

    //Override toString method to printout objects with readable data
    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", person=" + person +
                ", until=" + until +
                '}';
    }

    //getters and setters from menu:  Code-> Generate... -> getter and setter (choose all)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getUntil() {
        return until;
    }

    public void setUntil(Date until) {
        this.until = until;
    }

    private Date until;




}
