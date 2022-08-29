public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Преступление и наказание", new Author("Федор", "Достоевский"), 1866);
        System.out.println(book1);

        Book book2 = new Book("Анна Каренина", new Author("Лев", "Толстой"), 1870);
        System.out.println(book2);

        book2.setYear(1873);
        System.out.println(book2);
    }
}