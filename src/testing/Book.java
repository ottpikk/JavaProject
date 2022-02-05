package testing;

public class Book {

    private int page;
    private String title;

    public Book (int page, String title){
        this.page = page;
        this.title = title;
    }

    public int getPage (){
        return page;
    }

    public String getTitle(){
        return title;
    }
}
