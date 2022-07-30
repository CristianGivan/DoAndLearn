package Projects.Library;

public class Client extends User {
    private Library library;
    private String[] borrowedBooks;

    public Client(String name, Library library) {
        super(name);
        this.library=library;
    }
    public String[] getBorrowedBooks(){
        return this.borrowedBooks;
    }
    public void borrowBook(String isbn){

    }
    public void returnBook(String isbn){

    }


    public void displayBorrowedBooks(){
        for (int i=0; i<borrowedBooks.length;i++){
            System.out.println(borrowedBooks[i]);
        }
    }



}
