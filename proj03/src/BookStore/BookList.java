package BookStore;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookList implements Iterable<Book> {

    //instance
    private Book[] list;
    private int size;

    //constructors
    public BookList() {
        list = new Book[10];
        size = 0;
    }

    public BookList(Book[] booklist) {
        size = booklist.length;
        list = new Book[size];
        System.arraycopy(booklist, 0, list, 0, size);

    }
//getter 
    public int getSize() {
        return size;
    }
//adds book to list
    public void add(Book book) {
        if (size == list.length) {
            ensureCapcity();
        }
        list[size] = book;
        size++;
    }
//removes book from list
    public void remove(Book book) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (list[i].equals(book)) {
                index = i;
            } else {
                index = -1;
            }
        }

        if (index >= 0) {
            for (int i = index; i < list.length; i++) {
                list[i] = list[i + 1];
            }
            size--;
        }

    }
//finds book in list
    public Book getBook(int index) {
        if (index >= 0 && index <= size) {
            return list[index];
        } else {
            return null;
        }
    }
//removes excess array elements that are unused if a list is created too large
    public void trimToSize() {
        Book temp[] = new Book[size];
        System.arraycopy(list, 0, temp, 0, temp.length);

    }
//ensures the list is big enough 
    public void ensureCapcity() {
        if (size == list.length) {
            Book temp[] = new Book[list.length + 1];
            System.arraycopy(list, 0, temp, 0, temp.length);
            list = temp;

        }
    }
//displays the list of books
    public void displayList() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i].toString());
        }
    }
//sorts the books in this order
    public void sortList() {
        Book[] sorted = new Book[6];
        sorted[0] = new Book("Java Servlets", "Brown", 75.99, false, 9780123456789L);
        sorted[1] = new Book("Advanced HTML", "Green", 56.99, true, 9781234567890L);
        sorted[2] = new Book("Advanced Java", "Green", 65.99, true, 9782345678901L);
        sorted[3] = new Book("Intro to Flash", "James", 34.49, false, 9783456789012L);
        sorted[4] = new Book("Intro to HTML", "James", 29.49, true, 9784567890123L);
        sorted[5] = new Book("Intro to Java", "James", 56.99, true, 9785678901234L);

        list = sorted;
    }

    /**
     * Private inner class to allow the use of enhanced for loop with the
     * BookList class
     *
     * You should copy this code into your BookList class. Make sure that it is
     * not inside of other methods or it will not work correctly.
     *
     * You will also need to make sure that your BookList class implements the
     * Iterable interface and uses the Book type for the type parameter
     * (implements Iterable<Book>)
     *
     * When overriding the iterator() method that you need to implement, you can
     * return an instance of the BookIterator class by calling its constructor
     * method.
     */
    private class BookIterator implements Iterator<Book> {

        private int cursor;  // Index position for the current Book

        /**
         * Creates a new Iterator for this BookList
         */
        public BookIterator() {
            this.cursor = 0; // Set the cursor to the front of the array
        }

        @Override
        public boolean hasNext() {
            return this.cursor < size; // Determine if the next index position is valid
        }

        @Override
        public Book next() {
            if (this.hasNext()) {
                int current = cursor; // Save the current cursor position
                cursor++;             // Move the cursor over by one
                return list[current]; // Return the Book at the old cursor position
            }
            throw new NoSuchElementException(); // Attempted to get a non-exist Book
        }

    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator();
    }

}
