package bookApp;

public class FrontDesk {
    public static void main(String[] args) {
        Library library= new Library();
        Book book = new Book("Book1","John Author1",12.5);
        Book book1 = new Book("Book2","Author1",12.5);
        Book book2 = new Book("Ana"," JohnAuthor2",12.5);

        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.printBooks();
        String[] findBooks= library.findBooksByAuthor("Author1");
        for (int i = 0; i < findBooks.length; i++) {
            if (findBooks[1]!=null) {
                System.out.println(findBooks[i]);
            }else {
                break;
            }
        }

        boolean isPalindrom = library.isPalindrom("anai");
        System.out.println(isPalindrom);

        /*
        public  void addPredefinedBooks(){

            Library library= new Library();
            Book book = new Book("Book1","Author1",11.5);
            bookList[0]= book;
            book = new Book("Book2","Author2",12.5);
            bookList[1]= book;
            book = new Book("Book3","Author3",13.5);
            bookList[2]= book;
            book = new Book("Book4","Author4",14.5);
            bookList[3]= book;
            book = new Book("Book5","Author5",15.5);
            bookList[4]= book;

        }*/
    }


}
