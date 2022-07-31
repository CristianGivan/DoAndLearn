package bookApp;

public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title= title;
        this.author=author;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
