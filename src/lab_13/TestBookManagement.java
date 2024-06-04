package lab_13;

import lesson_13.DataFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBookManagement {

    public void showMenu() {
        System.out.println("======= Book Management Program (CRUD)============");
        System.out.println("1. New book");
        System.out.println("2. Find a book(ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");
    }

    public List<Book> loadBookDatabase(String filePath) {
        return BookDataFactory.getBookList(filePath);
    }

    public void saveBookList(List<Book> bookList, String filePath) {
        BookDataFactory.saveBookList(bookList, filePath);
    }

    public Book inputBookInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Please input title: ");
        String title = scanner.nextLine();
        System.out.println("Please input author: ");
        String author = scanner.nextLine();
        System.out.println("Please input year: ");
        String year = scanner.nextLine();

        return new Book(isbn, title, author, year);
    }

    public Book FindBookWithISBN(String isbn, List<Book> bookList) {
        for (Book book : bookList) {
            if (book.getISBN().equals(isbn)) {
                System.out.println(book.toString());
                return book;
            }
        }

        return null;
    }

    public void showNewBookInfo(Book newBook) {
        System.out.println("book is saved into DB with info : " + newBook.toString());
    }

    public String inputISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz input ISBN: ");

        return scanner.nextLine();
    }

    public void addNewBook(String filePath) {
        List<Book> bookList = loadBookDatabase(filePath);

        Book newBook = inputBookInfo();

        if (FindBookWithISBN(newBook.getISBN(), bookList) != null) {
            System.out.println("the book is existed, Plz check!!!");
        } else {
            bookList.add(newBook);
            showNewBookInfo(newBook);
            saveBookList(bookList, filePath);
        }
    }

    public void findABook(String filePath) {
        List<Book> bookList = loadBookDatabase(filePath);

        String isbn = inputISBN();

        Book book = FindBookWithISBN(isbn, bookList);
        if(book == null) {
            String msg = "Book with ISBN " + isbn + " is not found";
            System.out.println(msg);
        }
    }

    public void updateABook(String filePath) {
        List<Book> bookList = loadBookDatabase(filePath);
        Scanner scanner = new Scanner(System.in);
        String isbn = inputISBN();

        Book updatedBook = FindBookWithISBN(isbn, bookList);

        if (updatedBook != null) {
            //get updated book info
            System.out.println("Please input title: ");
            String title = scanner.nextLine();
            System.out.println("Please input author: ");
            String author = scanner.nextLine();
            System.out.println("Please input year: ");
            String year = scanner.nextLine();

            //Update book info
            updatedBook.setAuthor(author);
            updatedBook.setTitle(title);
            updatedBook.setYear(year);

            System.out.println("The book now is updated with new content: " + updatedBook.toString());
            //Save updated book to book db
            BookDataFactory.saveBookList(bookList, filePath);
        } else {
            System.out.println("The ISBN is not existed");
        }
    }

    public void deleteABook(String filePath) {
        List<Book> bookList = loadBookDatabase(filePath);

        String isbn = inputISBN();

        Book deleteBook = FindBookWithISBN(isbn, bookList);

        if (deleteBook != null) {
            bookList.remove(deleteBook);
            System.out.println("The book now is deleted ");
            //Save updated book to book db
            BookDataFactory.saveBookList(bookList, filePath);
        } else {
            System.out.println("The ISBN is not existed");
        }
    }

    public void printBookList(String filePath) {
        List<Book> bookList = loadBookDatabase(filePath);

        System.out.println("THE BOOK LIST: ");
        int count = 1;

        for (Book book : bookList) {
            System.out.println("Book " + count++ + ": " + book.getTitle());
            System.out.println("     ISBN: " + book.getISBN());
            System.out.println("     author: " + book.getAuthor());
            System.out.println("     year: " + book.getYear());
        }
    }

    public static void main(String[] args) {
        TestBookManagement testBookManagement = new TestBookManagement();

        boolean isContinue = true;

        while (isContinue) {
            String relativeFilePath = "/src/lab_13/Book.txt";
            String absolutePath = System.getProperty("user.dir") + relativeFilePath;

            //show menu for user
            testBookManagement.showMenu();

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                   testBookManagement.addNewBook(absolutePath);
                   break;
                case 2:
                    testBookManagement.findABook(absolutePath);
                    break;
                case 3:
                    testBookManagement.updateABook(absolutePath);
                    break;
                case 4:
                    testBookManagement.deleteABook(absolutePath);
                    break;
                case 5:
                    testBookManagement.printBookList(absolutePath);
                    break;
                case 0:
                    isContinue = false;
                    System.out.println("Program is existed. See U later!!!");
                    break;
                default:
                    System.out.println("The option is invalid, Plz input the right option");
            }
        }
    }
}
