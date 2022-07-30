package Projects.Library;

public class Library {
    private Book[] allBooks;
    private int numberOfBooks;

    public Library(Book[] allBooks) {
        this.allBooks = allBooks;
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] != null) {
                numberOfBooks = i + 1;
            }
        }

    }

    public void setAllBooks(Book[] allBooks) {
        this.allBooks = allBooks;
    }

    public Book[] getAllBooks() {
        return this.allBooks;
    }


    public void addBook(Book book) {
        //exceptie sa nu se depaseasca numar maxim de arrayuri
        allBooks[numberOfBooks] = book;
        numberOfBooks++;
    }

    public void deleteBook(String isbn) {
        // exceptie daca nu sunt carti in lista de sters
        int index = indexFindByIsbn(isbn);
        deleteBookAtIndex(index);

    }

    public void deleteCopyOfBook(String isbn) {
        // exceptie daca nu sunt suficiente copi sau toate copiile sunt imprumutate
        int index = indexFindByIsbn(isbn);
        deleteCopyOfBookAtIndex(index);

    }

    public void deleteCopyOfBook(String isbn, int numberOfCopiesToDelete) {
        int index = indexFindByIsbn(isbn);
        deleteCopyOfBookAtIndex(index, numberOfCopiesToDelete);
    }


//privat pentru ca nu cred ca o sa folosesc vreodata dinafara si sa nu incurce

    private int indexFindByIsbn(String isbn) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (allBooks[i].getIsbn().equals(isbn)) {
                return i;
            }
        }
        return -1;
    }

    private void deleteBookAtIndex(int index) {
        for (int i = index; i < numberOfBooks; i++) {
            allBooks[i] = allBooks[i + 1];
        }
        numberOfBooks--;
    }

    private void deleteCopyOfBookAtIndex(int index) {
        int newNumberOfCopy = allBooks[index].getNumberOfCopies() - 1;
        allBooks[index].setNumberOfCopies(newNumberOfCopy);
    }

    private void deleteCopyOfBookAtIndex(int index, int numberOfCopiesToDelete) {
        int newNumberOfCopy = allBooks[index].getNumberOfCopies() - numberOfCopiesToDelete;
        allBooks[index].setNumberOfCopies(newNumberOfCopy);
    }

    public void displayBookDetails(String isbn) {
        int index = indexFindByIsbn(isbn);
        System.out.println(allBooks[index].toString());
    }
//todo
    public void displayListOfBooks(String[] bookList){
        int index;
        for (int i=0; i<bookList.length;i++){
            index = indexFindByIsbn(bookList[i]);
            System.out.println(allBooks[index].toString());
        }

    }
    public void printAllBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(this.allBooks[i].toString());

        }
    }


/////////////////////////


    public Book[] findBooksByUser(User user) {

        int numberOfCopies = 1;
        Book[] books = new Book[numberOfCopies];


        return books;
    }

    public Book[] findAllAvailableBooks() {

        int numberOfCopies = 1;
        Book[] books = new Book[numberOfCopies];


        return books;
    }

    //specifies where to search and what search
    // if the book is not find return null
    public Book findBookBy(String searchWhere, String searchWhat) {

        Book book = null;


        return book;
    }

    public void borrowBook(String ISBN, User user) {

    }

    public void returnBook(String ISBN, User user) {

    }

}
