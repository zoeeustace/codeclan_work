import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(1);
        book = new Book("1984", "Dystopian", "George Orwell");
        book = new Book("The Great Gatsby", "Modern American", "F Scott Fitzgerald");
        library.addBook(book);
        library.addBook(book);
    }

    @Test
    public void bookCount(){
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void checkCapacity(){
       assertEquals(true, library.checkCapacity());
    }

    @Test
    public void canAddBookToLibrary(){
        library.checkCapacity();
        library.addBook(book);
        assertEquals(3, library.getBookCount());
    }

}
