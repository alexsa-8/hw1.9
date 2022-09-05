import java.util.Arrays;
import java.util.Objects;

class Name {

    public static <bookList> void main(String[] args) {
        Book book = new Book(new Author("Лев", "Толстой"), "Война и мир", 1869);
        Book book1 = new Book(new Author("Иван", "Тургенев"), "Отцы и дети", 1861);
        Book book2 = new Book(new Author("Александр", "Пушкин"), "Евгений Онегин", 1830);
        Book book3 = new Book(new Author("Лев", "Толстой"), "Детство", 1852);
        Book[] books = new Book[10];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        for (int i = 0; i < 10; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
        //Arrays.stream(books).filter(Objects::nonNull).map(Book::printBook).forEach(System.out::println);
        //Arrays.stream(books).filter(Objects::nonNull).map(Book -> book.printBook(book)).forEach(System.out::println);
    }
}



