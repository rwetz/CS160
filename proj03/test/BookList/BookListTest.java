/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookList;

import BookStore.Book;
import BookStore.BookList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ryan.wetzstein
 */
public class BookListTest {
    //•	add
//•	remove
//•	getBook
//•	sortList

    //
    private BookList testBookList;
    private Book[] book;

    @Test
    public void testAddToEmptyList() {
        BookList bookList = new BookList();
        Book testBook = new Book("Book", "Author", 00.00, true, 9780123456789L);
        bookList.add(testBook);

        assertEquals(testBook, bookList.getBook(0));
    }

    @Test
    public void testAddToNonEmptyList() {
        BookList bookList = new BookList();
        Book initialBook = new Book("First", "A1", 00.00, false, 9780123456789L);
        bookList.add(initialBook);
        Book testBook = new Book("Second", "A2", 00.00, true, 9781234567890L);
        bookList.add(testBook);

        assertEquals(testBook, bookList.getBook(1));
    }

    @Test
    public void testRemoveExistingBook() {
        BookList bookList = new BookList();
        Book testBook = new Book("B1", "AA", 00.00, true, 9780123456789L);
        bookList.add(testBook);
        bookList.remove(testBook);

        assertEquals(0, bookList.getBook(0));
    }

    @Test
    public void testRemoveNonExistingBook() {
        BookList bookList = new BookList();
        Book initialBook = new Book("First", "A", 00.00, false, 9780123456789L);
        bookList.add(initialBook);
        Book testBook = new Book("Second", "A2", 00.00, true, 9781234567890L);
        bookList.remove(testBook);

        assertEquals(initialBook, bookList.getBook(0));
    }

    @Test
    public void testGetBookValidIndex() {
        BookList bookList = new BookList();
        Book testBook = new Book("Test Book", "Test Author", 00.00, true, 9780123456789L);
        bookList.add(testBook);

        assertEquals(testBook, bookList.getBook(0));
    }

    @Test
    public void testGetBookInvalidIndex() {
        BookList bookList = new BookList();
        Book testBook = bookList.getBook(5); // Invalid index

        assertEquals(null, testBook);
    }

    @Test
    public void testSortSortedList() {
        BookList bookList = new BookList();
        for (int i = 0; i < 5; i++) {
            bookList.add(new Book("Book " + i, "A", 00.00, false, 9780123456789L + i));
        }
        bookList.sortList();

        assertEquals("Book 0", bookList.getBook(0).getTitle());
        assertEquals("Book 1", bookList.getBook(1).getTitle());
        assertEquals("Book 2", bookList.getBook(2).getTitle());
        assertEquals("Book 3", bookList.getBook(3).getTitle());
        assertEquals("Book 4", bookList.getBook(4).getTitle());
    }

    @Test
    public void testSortUnsortedList() {
        BookList bookList = new BookList();
        bookList.add(new Book("Book 2", "Author", 00.00, false, 9783456789012L));
        bookList.add(new Book("Book 1", "Author", 00.00, false, 9782345678901L));
        bookList.add(new Book("Book 3", "Author", 00.00, false, 9784567890123L));
        bookList.sortList();

        assertEquals("Book 1", bookList.getBook(0).getTitle());
        assertEquals("Book 2", bookList.getBook(1).getTitle());
        assertEquals("Book 3", bookList.getBook(2).getTitle());
    }
}
