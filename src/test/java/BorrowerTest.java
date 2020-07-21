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
        library.addBook(book);
    }

    @Test
    public void startsWithNoBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canLoanBook(){
        borrower.loanBook(library, book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void cantLoanOutOfStockBook(){
        Book outOfStockBook = new Book("Lord of the Rings", "Tolkien", "Fiction");
        borrower.loanBook(library, outOfStockBook);
        assertEquals(0, borrower.bookCount());
    }

}
