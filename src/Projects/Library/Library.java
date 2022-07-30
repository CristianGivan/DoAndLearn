package Projects.Library;

public class Library {
    private Book[] all;
    private Book[] available;
    private Book[] borrowed;


    public boolean addBook(Book book){

        return false;//if something went wrong
    }
    public boolean deleteBook(String bookName){
        return false;//if something went wrong
    }
    public boolean deleteOneCopy(String bookName){

        return false;//if something went wrong maybe there are no copies
    }
    public Book findBookByISBN(String ISBN){

        Book book=null;


        return book;
    }

    public Book[] findBooksByUser(User user){

        int numberOfCopies=1;
        Book[] books=new Book[numberOfCopies];


        return books;
    }

    public Book[] findAllAvailableBooks(){

        int numberOfCopies=1;
        Book[] books=new Book[numberOfCopies];


        return books;
    }
    //specifies where to search and what search
    // if the book is not find return null
    public Book findBookBy(String searchWhere, String searchWhat){

        Book book=null;


        return book;
    }
    public void borrowBook(String ISBN, User user) {

    }

    public void returnBook(String ISBN,User user) {

    }

}
