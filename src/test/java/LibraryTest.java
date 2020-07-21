import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book outOfStockBook;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Harry Potter", "Rowling", "Fiction");
        library.addBook(book);
        outOfStockBook = new Book("Lord of the Rings", "Tolkien", "Fiction");
    }

    @Test
    public void hasBooks(){
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void wontAddBookIfFull(){
        Library fullLibrary = new Library(0);
        fullLibrary.addBook(book);
        assertEquals(0, fullLibrary.bookCount());
    }

    @Test
    public void canFindBook(){
        assertTrue(library.checkIfBookInStock(book));
    }

    @Test
    public void cantFindBookThatsOutOfStock(){
        assertFalse(library.checkIfBookInStock(outOfStockBook));
    }

    @Test
    public void canRemoveBook(){
        library.removeBook(book);
        assertEquals(0, library.bookCount());
    }
}
