package Homework9;

public class ReaderInfo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Tkachenko O.A.", 1, "IT", "21.10.1993", "+380637789087");
        Reader reader2 = new Reader("Semenuik T.O.", 1, "IT", "21.10.1992", "+380635589000");
        Reader reader3 = new Reader("Polishchuk A.M", 1, "IT", "21.10.1995", "+380632488056");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("To Kill a Mockingbird", ": Harper Lee");
        Book book2 = new Book("One Flew over the Cuckoo's Nest", "Ken Kesey");
        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury");
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(5);
        reader2.takeBook("Flowers for Algernon, Daniel Keyes", "The Catcher in the Rye, J.D. Salinger ");
        reader3.returnBook(book3);
    }

    private static void printBooks(Book[] books) {
        System.out.println("List of books:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }

        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("List of readers:");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
        System.out.println();
    }
}
