public class Book {

    final String authorName;
    final String bookName;
    int yearOfPublication;

    public Book(String authorName, int yearOfPublication, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthorName() {
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
