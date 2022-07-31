package Projects.Library;

public class Admin extends User {

    private Library library;

    public Admin(String name, Library library) {
        super(name);
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void addBook(Book book) {
        //tratez exceptiile

        library.addBook(book);
    }

    public void deleteBook(String isbn) {
        library.deleteBook(isbn);
    }

    public void deleteOneCopyOfBook(String isbn) {
        library.deleteCopyOfBook(isbn);

    }

    public void deleteMoreCopiesOfBook(String isbn, int numberOfCopiesToDelete) {
        library.deleteCopyOfBook(isbn, numberOfCopiesToDelete);
    }

    public void displayBookDetails(String isbn) {
        library.displayBookDetails(isbn);
    }

    public void displayAllBooksDetails() {
        library.printAllBooks();
    }
    public void displayBooksBorrowedByUser(Client student){
        student.displayBorrowedBooks();
    }


}
