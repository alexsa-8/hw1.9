class Main {

    public static void main(String[] args) {

        Book book = new Book("Толстой Л.Н.", 1869, "Война и мир");
        Author author = new Author("Лев", "Толстой");
        System.out.println(book.authorName+" "+book.bookName+" "+book.yearOfPublication);
        System.out.println(author.firstName+" "+author.lastName);
    }
}

