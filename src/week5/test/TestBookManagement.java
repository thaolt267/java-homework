package week5.test;

import week5.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBookManagement {
    
    static List<Book> books = new ArrayList<>();
    static String bookDB = "/AutomationLearning/java-homework/books.txt";

    public static void bookMenu() {
        System.out.println("Please select an Option:");
        System.out.println("\t1. Add a new book");
        System.out.println("\t2. Find a book base on ISBN");
        System.out.println("\t3. Find Books from an Author");
        System.out.println("\t4. Exit program");

        int inputOption;
        Scanner scanner = new Scanner(System.in);
        inputOption = scanner.nextInt();

        switch (inputOption) {
            case 1:
                addNewBook();
                break;
            case 2:
                findBook();
                break;
            case 3:
                findBooksFromAuthor();
                break;
            case 4:
                System.exit(4);
                break;
            default:
                System.out.println("That option is invalid!");
                break;
        }
    }

    private static void findBook() {
    }

    private static void findBooksFromAuthor() {
    }

    private static void addNewBook() {
    }
}
