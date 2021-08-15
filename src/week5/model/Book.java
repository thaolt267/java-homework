package week5.model;

public class Book {

    private String title;
    private String authorName;
    private int ISBN;
    private int year;

    public Book() {
    }

    public Book(String title, String bookAuthor, int ISNB, int year) {
        this.title = title;
        this.authorName = bookAuthor;
        this.ISBN = ISNB;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ISBN=" + ISBN +
                ", year=" + year +
                '}';
    }
}
