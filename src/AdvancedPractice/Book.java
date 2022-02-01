package AdvancedPractice;

public class Book extends Literature { // takes everything from Literature Class

    // Add some fields
    private String publisher;
    private String genre;

    public Book (String title, String author, String publisher, String genre){
        super(title,author);                //take over from Inherited Class
        this.publisher = publisher;
        this.genre = genre;
    }

    @Override                               // change Inherited class Print method
    public void Print() {
        super.Print();                                          // take over everything
        System.out.println("\tPublished By: " + publisher);     // add some specific lines for Book Class
        System.out.println("\tIs A: " + genre);
    }
}
