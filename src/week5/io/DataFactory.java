package week5.io;

import week5.model.Book;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static boolean saveBookList(List<Book> books, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            for (Book book : books) {
                String dataLine = book.getTitle() + ";" + book.getISBN() + ";" + book.getAuthorName() + ";" + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();

            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return false;
    }

    public static List<Book> readBookList(String path) {
        List<Book> books = new ArrayList<>();


        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String dataLIne = bufferedReader.readLine();
            while (dataLIne != null) {
                String[] bookData = dataLIne.split(";");
                String title = bookData[0];

                int ISBN = Integer.parseInt(bookData[1]);

                String authorName = bookData[2];

                int year = Integer.parseInt(bookData[3]);

                books.add(new Book(title, authorName, ISBN, year));

                dataLIne = bufferedReader.readLine();
            }

            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
