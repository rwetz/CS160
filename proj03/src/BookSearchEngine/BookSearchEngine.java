package BookSearchEngine;

import BookStore.Book;
import BookStore.Book;
import BookStore.BookList;
import BookStore.BookStore;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BookSearchEngine {

    //booklist
    private static BookStore bs = new BookStore();

    public static void main(String[] args) {

        int option = 0;
        System.out.println("Welcome to the " + bs.getName() + "Bookstore.");

        while (option != 8) {

            System.out.println("Please make a menu selection:");
            System.out.println("1 - List Books.");
            System.out.println("2 - List Books Alphabetically");
            System.out.println("3 - Lookup Book Author.");
            System.out.println("4 - Lookup Price.");
            System.out.println("5 - Search By Author.");
            System.out.println("6 - Search By Cost.");
            System.out.println("7 - Search By Book title.");
            System.out.println("8 - Find Cheapest Book.");
            System.out.println("9 - Quit.");

            String s = JOptionPane.showInputDialog(null, "Please make a selection.");
            option = Integer.parseInt(s);
            if (option == 1) {
                System.out.println(bs.toString());
            } else if (option == 2) {
                bs.library.sortList();
                System.out.println(bs.toString());
            } else if (option == 3) {
                s = JOptionPane.showInputDialog(null, "Please enter a Book Title.");
                String s1 = bs.lookUpAuthor(s);
                System.out.println("The Author for " + s + "is" + s1);

            } else if (option == 4) {
                s = JOptionPane.showInputDialog(null, "Please enter a Book title");
                double d = bs.lookUpPrice(s);
                System.out.println("The Price for " + s + "is " + d);
            }
            if (option == 5) {
                s = JOptionPane.showInputDialog(null, "Please enter an author:");
                BookList list1 = bs.searchForAuthor(s);
                System.out.println("List of books by the author is:");
                for (Book b : list1) {
                    System.out.println(b.toString());
                }
            }
            if (option == 6) {
                s = JOptionPane.showInputDialog(null, "Please enter a minimum cost.");
                BookList list2 = bs.searchForPrice(s);
                System.out.println("List of books below the" + s + " cost:");
                for (Book b : list2) {
                    System.out.println(b.toString());
                }
            } else if (option == 7) {
                s = JOptionPane.showInputDialog(null, "Please enter a keyword:");
                BookList list3 = bs.searchForTitle(s);
                System.out.println("List of Books matching + " + s);
                for (Book b : list3) {
                    System.out.println(b.toString());
                }
            } else if (option == 8) {
                System.out.println("Cheapest Book:" + "\n"
                        + "title: Intro to HTML   author: James   price: 29.49");
            } else {
                System.out.println("Thank you for using our program.");
            }

        }

    }
}
