class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        //Book book = new Book("Толстой Л.Н.", "Война и мир", 1869);
        Book book= new Book("Толстой Л.Н.","Война и мир", 1869);
        System.out.println(book);
        Author author = new Author("Лев", "Толстой");
        System.out.println(author);
    }
}

