package lab_13;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookDataFactory {

    private static String separate_char = ";";

    public static List<Book> getBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();

        try(
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ) {
            String bookLine = bufferedReader.readLine();
            while (bookLine != null) {
                String[] bookInfo = bookLine.split(separate_char);
                String isbn = bookInfo[0];
                String title = bookInfo[1];
                String author = bookInfo[2];
                String year = bookInfo[3];

                Book book = new Book(isbn, title, author, year);
                bookList.add(book);
                bookLine = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("DB file doesn't exist");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookList;

    }

    public static void saveBookList(List<Book> bookList, String dataPath) {
        if (!bookList.isEmpty()) {
            try (
                    FileOutputStream fileOutputStream = new FileOutputStream(dataPath);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                    ) {
                for (Book book : bookList) {
                    String bookLine = book.getISBN() + separate_char + book.getTitle() + separate_char + book.getAuthor() + separate_char +
                            book.getYear();
                    bufferedWriter.write(bookLine);
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
