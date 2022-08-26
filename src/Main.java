public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", new Author("Федор", "Достоевский"), 1866);
        printBook(book1);

        Book book2 = new Book("Анна Каренина", new Author("Лев", "Толстой"), 1870);
        printBook(book2);

        book2.setYear(1873);
        printBook(book2);
    }

    public static void printBook(Book book){
        System.out.printf("Книга - %s, Автор - %s, Год - %d\n", book.getName(), book.getAuthor().getFullName(), book.getYear());
    }
}