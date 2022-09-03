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
    public String toString() {
        return "Book{" +
                "author=" + authorName +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}
