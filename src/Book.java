import java.util.Objects;

public class Book {
    private final Author authorName;
    private final String bookName;
    private int yearOfPublication;
    public Book(Author authorName, String bookName, int yearOfPublication) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }
    public Book(String firstName, String lastName, String bookName, int yearOfPublication) {
        this.authorName = new Author(firstName, lastName);
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public String getBookName() {
        return bookName;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String printBook(Book book) {
        return this.authorName.getFirstName() + " " +
                this.authorName.getLastName() + " " +
                this.bookName + " " +
                this.yearOfPublication;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && authorName.equals(book.authorName) && bookName.equals(book.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, yearOfPublication);
    }
    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
