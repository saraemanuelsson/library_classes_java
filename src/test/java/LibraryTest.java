import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Harry Potter", "Rowling", "Fiction");
        library.addBook(book);
    }

    @Test
    public void hasBooks(){
        assertEquals(1, library.bookStock());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(2, library.bookStock());
    }
}
