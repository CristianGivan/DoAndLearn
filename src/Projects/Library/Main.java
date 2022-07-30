package Projects.Library;

public class Main {
    public static void main(String[] args) {
        final int MAXIM_BOOKS_IN_LIBRARY = 100;

        Book[] books = new Book[MAXIM_BOOKS_IN_LIBRARY];
        books = initializateLibrary(books);
        Library library = new Library(books);
        Admin admin = new Admin("Bibliotecar1", library);
        Client student = new Client("Student1", library);
        Book newBook = new Book("New Book", "Old Author", "B105", 5, 6);
        admin.addBook(newBook);
        admin.displayAllBooksDetails();
        System.out.println("\n");
        admin.displayBookDetails("B103");

        //Debug
       /*
        admin.deleteBook("B102");
        admin.displayAllBooksDetails();
        System.out.println("\n");
        admin.deleteOneCopyOfBook("B103");
        admin.displayAllBooksDetails();
        System.out.println("\n");
        admin.deleteMoreCopiesOfBook("B104",2);
        admin.displayAllBooksDetails();
        System.out.println("\n");



       System.out.println(library.getAllBo` oks()[1]);
        System.out.println(library.getAllBooks()[2]);*/


    }

    public static Book[] initializateLibrary(Book[] books) {

        books[0] = new Book("Book1", "Author1", "B100", 3, 0);
        books[1] = new Book("Book2", "Author2", "B101", 4, 1);
        books[2] = new Book("Book3", "Author3", "B102", 5, 2);
        books[3] = new Book("Book4", "Author4", "B103", 6, 3);
        books[4] = new Book("Book5", "Author5", "B104", 7, 4);
        return books;
    }
}
