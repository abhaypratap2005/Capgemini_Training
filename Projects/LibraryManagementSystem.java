package Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    int bookid;
    String title;
    String author;
    int price;
    int available;
    Boolean status;

    ArrayList<LibraryManagementSystem> books = new ArrayList<>();

    // ADD BOOK
    void addBook(int id, String title, String author, int price, int available) {
        LibraryManagementSystem b = new LibraryManagementSystem();
        b.bookid = id;
        b.title = title;
        b.author = author;
        b.price = price;
        b.available = available;
        b.status = true;

        books.add(b);
        System.out.println("Book added");
    }

    // ISSUE BOOK
    public void IssueBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookid == id) {
                if (books.get(i).status) {
                    books.get(i).status = false;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Book already issued");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    // RETURN BOOK
    public void ReturnBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookid == id) {
                books.get(i).status = true;
                System.out.println("Book Returned");
                return;
            }
        }
        System.out.println("Book not found");
    }

    // SHOW BOOK
    public void showBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).bookid == id) {
                System.out.println("ID: " + books.get(i).bookid);
                System.out.println("Title: " + books.get(i).title);
                System.out.println("Author: " + books.get(i).author);
                System.out.println("Price: " + books.get(i).price);
                System.out.println("Available: " + books.get(i).available);
                System.out.println("Status: " + books.get(i).status);
                return;
            }
        }
        System.out.println("Book nahi h bhai");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryManagementSystem lms = new LibraryManagementSystem();

        while (true) {
            System.out.println("\nChoose one option");
            System.out.println("1-Add book");
            System.out.println("2-Issue Book");
            System.out.println("3-Return Book");
            System.out.println("4-Show Book");
            System.out.println("5-Exit");

            int n = sc.nextInt();
            sc.nextLine();

            if (n == 1) {
                System.out.println("Enter in order-> id, title, author, price, available");
                int id = sc.nextInt();
                sc.nextLine();
                String title = sc.nextLine();
                String author = sc.nextLine();
                int price = sc.nextInt();
                int available = sc.nextInt();

                lms.addBook(id, title, author, price, available);

            } else if (n == 2) {
                System.out.println("Enter book id");
                int id = sc.nextInt();
                lms.IssueBook(id);

            } else if (n == 3) {
                System.out.println("Enter book id");
                int id = sc.nextInt();
                lms.ReturnBook(id);

            } else if (n == 4) {
                System.out.println("Enter book id");
                int id = sc.nextInt();
                lms.showBook(id);

            } else if (n == 5) {
                System.out.println("Thank You");
                break;
            }
        }
    }
}
