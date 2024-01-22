/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookStore;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ryan.wetzstein
 */
public class BookStoreTest {

    private BookStore testBookStore;

    public BookStoreTest() {
        testBookStore = new BookStore();
    }

    @Test
    public void templateTest() {
        // setup test values

        // set expected result
        // get actual result
        // compare expected and actual results
    }

//•	searchForTitle
//•	searchForAuthor
//•	searchForPrice
//•	getLowestPrice
//•	(Your method for looking up a book based on ISBN)
    //lookup author
    @Test
    public void testLookupAuthorExistingAuthor() {
        String authorSearchResult = testBookStore.lookUpAuthor("Java Servlets");
        assertEquals("Brown", authorSearchResult);

    }

    @Test
    public void testLookupAuthorNonexistentAuthor() {
        String authorSearchResult = testBookStore.lookUpAuthor("");
        assertEquals("Could Not Find Book.", authorSearchResult);
    }

    //luukup price
    @Test
    public void testLookupPriceExistingPrice() {
        double priceSearchResult = testBookStore.lookUpPrice("Java Servlets");
        assertEquals(75.99, priceSearchResult, 0.01);

    }

    @Test
    public void testLookupPriceNonexistentPrice() {
        double priceSearchResult = testBookStore.lookUpPrice("");
        assertEquals(Double.NaN, priceSearchResult, 0);

    }

    @Test
    public void testSearchForExistingTitle() {
        BookList titleList = testBookStore.searchForTitle("Java");
        assertEquals(3, titleList.getSize());
    }

    @Test
    public void testSearchForNonexistantTitle() {
        BookList titleList = testBookStore.searchForTitle("Ryan");
        assertEquals(0, titleList.getSize());
    }

    @Test
    public void testSearchForAuthor() {
        BookList authorList = testBookStore.searchForAuthor("Green");
        assertEquals(2, authorList.getSize());
    }

    @Test
    public void testSearchForNonexistantAuthor() {
        BookList authorList = testBookStore.searchForAuthor("LeBron James");
        assertEquals(0, authorList.getSize());
    }

    @Test
    public void testSearchForPrice() {
        BookList priceList = testBookStore.searchForPrice("56.99");
        assertEquals(2, priceList.getSize());
    }

    @Test
    public void testSearchForNonexistantPrice() {
        BookList priceList = testBookStore.searchForPrice("10000.00");
        assertEquals(0, priceList.getSize());
    }

    @Test
    public void testLowestPriceBook() {
        Book testBook = testBookStore.getLowestPrice();
        assertEquals("Intro to HTML", testBook.getTitle());
        assertEquals("James", testBook.getAuthor());
        assertEquals(29.49, testBook.getPrice(), 0.0);
    }

    @Test
    public void testValidISBN() {
        long testISBN = testBookStore.lookUpISBN("9780123456789");
        assertEquals(9780123456789L, testISBN);
    }

    @Test
    public void testInvalidISBN() {
        long testISBN = testBookStore.lookUpISBN("9999999999999");
        assertEquals(0000000000000L, testISBN);
    }
}
