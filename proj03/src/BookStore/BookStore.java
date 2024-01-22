package BookStore;

import BookStore.Book;
import java.util.ArrayList;
import java.util.Collections;

public class BookStore {

    //instance variables
    private String name;
    //private Book[] book;
    //book not used, obviously in here to mess with me
    public BookList library;

    public BookStore() {
        library = new BookList();
        library.add(new Book("Java Servlets", "Brown", 75.99, false, 9780123456789L));
        library.add(new Book("Advanced HTML", "Green", 56.99, true, 9781234567890L));
        library.add(new Book("Advanced Java", "Green", 65.99, true, 9782345678901L));
        library.add(new Book("Intro to Flash", "James", 34.49, false, 9783456789012L));
        library.add(new Book("Intro to HTML", "James", 29.49, true, 9784567890123L));
        library.add(new Book("Intro to Java", "James", 56.99, true, 9785678901234L));
    }

    public BookStore(Book[] bookArray) {
        library = new BookList(bookArray);
    }

//    public BookStore(BookList bookList) {
//        this.library = bookList;
//    }
    //uneeded
    public BookStore(String name, BookList library) {
        this.name = name;
        this.library = library;
    }

    @Override
    public String toString() {
        String result = "";
        for (Book tempBook : library) {
            result = result + tempBook.toString() + "\n";
        }
        return result;
    }

    //getters
    public String getName() {
        return name;
    }
//looks up the books for authors name

    public String lookUpAuthor(String searchString) {
        String searchResult = "";
        for (Book currentBook : library) {
            if (searchString.equals(currentBook.getTitle())) {
                searchResult = currentBook.getAuthor();
                return searchResult;
            }

        }
        return "Could Not Find Book.";
    }
//looks up the books prices

    public double lookUpPrice(String searchString) {
        double searchResult = 0;
        for (Book currentBook : library) {
            if ((currentBook.getTitle()).equals(searchString)) {
                searchResult = currentBook.getPrice();
                return searchResult;
            }
        }
        return Double.NaN;
    }
//searches books for a substring keyword (ex. "java")

    public BookList searchForTitle(String searchString) {
        BookList searchResult = new BookList();
        for (Book currentBook : library) {
            if ((currentBook.getTitle()).contains(searchString)) {
                searchResult.add(currentBook);
            }
        }
        //searchResult.trimToSize();
        return searchResult;
    }
//searches books by author

    public BookList searchForAuthor(String searchString) {
        BookList searchResult = new BookList();
        for (Book currentBook : library) {
            if ((currentBook.getAuthor()).equals(searchString)) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }
//searches by price

    public BookList searchForPrice(String searchString) {
        BookList searchResult = new BookList();
        double min = Double.parseDouble(searchString);
        for (Book currentBook : library) {
            if (currentBook.getPrice() == min) {
                searchResult.add(currentBook);
            }
        }
        searchResult.trimToSize();
        return searchResult;
    }
//finds lowest price book

    public Book getLowestPrice() {
        if (library.getSize() == 0) {
            return null;
        }

        Book lowestPriceBook = library.getBook(0);
        for (Book book : library) {
            if (book.getPrice() < lowestPriceBook.getPrice()) {
                lowestPriceBook = book;
            }
        }
        return lowestPriceBook;
    }
//looks up the books by their isbn number

    public long lookUpISBN(String searchString) {
        long searchResult = 000000000000L;
        long s = Long.parseLong(searchString);
        for (Book currentBook : library) {
            if (currentBook.getISBN() == s) {
                searchResult = currentBook.getISBN();
                return searchResult;
            }
        }
        return 0000000000000L;
    }
}
