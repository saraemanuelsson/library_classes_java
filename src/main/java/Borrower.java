import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }

    public int bookCount(){
        return this.books.size();
    }

}
