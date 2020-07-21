import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("Harry Potter", "Rowling", "Fiction");
        library = new Library(20);
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.bookCount());
    }

}
