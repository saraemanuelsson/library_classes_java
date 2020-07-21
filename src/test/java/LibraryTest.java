import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("Harry Potter", "Rowling", "Fiction");
        library.addBook(book);
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
}
