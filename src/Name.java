import java.util.Objects;

class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Book book = new Book("Толстой Л.Н.", "Война и мир", 1869);
        System.out.println(book);
        Author author = new Author("Лев", "Толстой");
        System.out.println(author);

        String[] bookList = new String[10];
        bookList[0] = "Отцы и дети";
        bookList[1] = "Евгений Онегин";
        bookList[2] = "Детство";


        String[] authorList = new String[10];
        authorList[0] = "Иван Тургенев";
        authorList[1] = "Александр Пушкин";
        authorList[2] = "Лев Толстой";

        int[] yearOfPublication = new int[10];
        yearOfPublication[0] = 1861;
        yearOfPublication[1] = 1830;
        yearOfPublication[2] = 1852;


        for (int i = 0; i < bookList.length; i++) {
            if (!(Objects.equals(bookList[i], "0") || Objects.equals(authorList[i], "0") || yearOfPublication[i] == 0)) {
                System.out.println(bookList[i] + " " + authorList[i] + " " + yearOfPublication[i]);
            } else {
                break;
            }
        }
    }
}



