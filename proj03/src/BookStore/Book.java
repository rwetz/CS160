package BookStore;

public class Book {

    String title;
    String author;
    double price;
    boolean hardcover;
    long ISBN;
    //double min = 57.00;
    //where is this used?

    public Book() {
        title = "";
        author = "";
        price = 0.0;
        hardcover = false;
        ISBN = 0000000000000L;
    }

    public Book(String newTitle, String newAuthor, double newPrice, boolean newHardcover, long newISBN) {
        title = newTitle;
        author = newAuthor;
        price = newPrice;
        hardcover = newHardcover;
        ISBN = newISBN;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public double getCost() {
        return price;
    }

    public long getISBN() {
        return ISBN;
    }

    public boolean getHardcover() {
        return hardcover;
    }

    //override this method
    @Override
    public String toString() {
        return ("Title: " + title + "\t"
                + "Author: " + author + "\t"
                + "Price: " + price);

    }

}
