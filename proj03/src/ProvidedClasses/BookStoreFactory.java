package ProvidedClasses;

import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;

public class BookStoreFactory {

    private BookStoreFactory() {

    }

    public static BookStore getBookStoreInstance() {
        BookStore store = new BookStore("The Shop Around The Corner", getBookCollectionInstance());

        return store;
    }

    public static BookList getBookCollectionInstance() {
        BookList list = new BookList();

        list.add(new Book("Don Quixote", "Miguel de Cervantes", 27.99, true, 9780133487123L));
        list.add(new Book("Catch-22", "Joseph Heller", 19.95, false, 9780146578374619L));
        list.add(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 17.85, false, 9789485782948L));
        list.add(new Book("Anna Karenina", "Leo Tolstoy", 27.99, false, 9780928379485L));
        list.add(new Book("The Catcher in the Rye", "J. D. Salinger", 14.99, true, 9780123456789L));
        list.add(new Book("Pride and Prejudice", "Jane Austen", 19.95, false, 9780432143214L));
        list.add(new Book("A Tale of Two Cities", "Charles Dickens", 9.95, false, 9780765432198L));
        list.add(new Book("I, Robot", "Issac Asimov", 9.95, true, 9780987654321L));
        list.add(new Book("The Stand", "Stephen King", 14.49, false, 978098144321L));
        list.add(new Book("Oliver Twist", "Charles Dickens", 13.99, true, 9780321654321L));
        list.add(new Book("A Study in Scarlet", "Arthur Conan Doyle", 8.95, false, 9780987676321L));
        list.add(new Book("The Count of Monte Cristo", "Alexandre Dumas", 22.95, true, 9780987658821L));
        list.add(new Book("The Moon is a Harsh Mistress", "Robert Heinlein", 9.95, false, 9780007654321L));
        list.add(new Book("The Hobbit", "J. R. R. Tolkein", 14.99, false, 9780000000000L));
        list.add(new Book("A Pocket Full of Rye", "Agatha Christie", 14.99, false, 9781187654321L));
        list.add(new Book("Ringworld", "Larry Niven", 19.95, true, 9780987654123L));
        list.add(new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", 27.99, false, 9780986754321L));
        list.add(new Book("A Wrinkle in Time", "Madeleine L'Engle", 14.95, false, 9780987655321L));
        list.add(new Book("War and Peace", "Leo Tolstoy", 27.99, true, 9780987564321L));
        list.add(new Book("The Adventures of Tom Sawyer", "Mark Twain", 8.95, false, 9780987123321L));
        list.add(new Book("Dragonflight", "Anne McCaffrey", 17.95, true, 9781237654321L));
        list.add(new Book("Treasure Island", "Robert Louis Stevenson", 7.95, false, 9780987612321L));
        list.add(new Book("Flowers for Algernon", "Daniel Keyes", 13.95, true, 9780789654321L));

        return list;
    }

}
