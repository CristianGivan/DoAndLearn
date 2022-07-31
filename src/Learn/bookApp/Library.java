package bookApp;

public class Library {
    Book[] bookList = new Book[100];
    int numberOfBooksAdded = 0;

    public void printBooks() {
        for (int i = 0; i < numberOfBooksAdded; i++) {
            System.out.println(bookList[i]);
        }
    }

    public boolean addBook(Book book) {
        Boolean status = false;
        bookList[numberOfBooksAdded] = book;
        numberOfBooksAdded++;

        return status;
    }


    public String[] findBooksByAuthor(String author) {
        int j = 0;
        String[] listauthor = new String[numberOfBooksAdded];
        for (int i = 0; i < numberOfBooksAdded; i++) {
            if (bookList[i].author == author) {
                listauthor[j] = bookList[j].title;
                j++;
            }
        }
        return listauthor;
    }

//    public String[] findAllPalindromeBooks() {
//
//    }

    public boolean isPalindrom(String word) {
        boolean isPalindrom = false;
        String reversStrimg = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversStrimg = reversStrimg + word.charAt(i);
        }
        System.out.println(reversStrimg);
        if (word.equals(reversStrimg)) {
            isPalindrom = true;
        }
        return isPalindrom;
    }

}
