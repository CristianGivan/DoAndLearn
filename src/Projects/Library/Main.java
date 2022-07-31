package Projects.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int selectedInMenu;

        final int MAXIM_BOOKS_IN_LIBRARY = 100;
        Book[] books = new Book[MAXIM_BOOKS_IN_LIBRARY];
        books = initializateLibrary(books);
        Library library = new Library(books);
        Menu menu = new Menu();
        Librarian librarian = new Librarian("Librarian1", library);
        Student student = new Student("Student1", library);
        Book newBook = new Book("New Book", "Old Author", "B105", 5, 6);
        //admin.addBook(newBook);
        //admin.displayAllBooksDetails();
        //System.out.println("\n");
/*

        do {
            displayMenu(menu.getTypeIn(), menu.getLogIn());
            System.out.println("\nYour chose is:");
            selectedInMenu = Integer.parseInt(typedByUser(console));

            switch (selectedInMenu) {
                case 0:
                    System.out.println("You chose to exit, bye for now!");
                    break;
                case 1:
                    System.out.println("You chose to " + menu.getLogIn()[1] + "\n");
                    logIn(librarian, student, menu, console);
                    break;
                case 2:
                    System.out.println("You chose to " + menu.getLogIn()[2] + "\n");
                    register();
                    break;
                case 3:
                    System.out.println("You chose to " + menu.getLogIn()[3] + "\n");
                    help();
                    break;
                default:
                    System.out.println("Unexpected chose, please try again from 0 to " +
                            (menu.getLogIn().length - 1) + " or type 0 to exit");

                    break;
            }


        } while (selectedInMenu != 0);
*/

        debugApp();
        actionByLibrarian(librarian, menu, console);

    }

    public static String typedByUser(Scanner console) {
        return console.nextLine();
    }

    public static void displayMenu(String[] typeIn, String[] menu) {
        System.out.println("Select from 0 to " + (menu.length - 1) + " from the to options: \n");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(typeIn[i] + menu[i]);
        }
    }

    public static void logIn(Librarian librarian, Student student, Menu menu, Scanner console) {
        String fromConsole;
        int selectedInMenu;
        System.out.println("Log in with user name (librarian or student): ");
        fromConsole = typedByUser(console);
        if (fromConsole.contains("lib")) {
            actionByLibrarian(librarian, menu, console);

        } else {
            actionsByStudent(menu, console);
        }
    }

    public static void register() {
    }

    public static void help() {
    }

    public static void actionByLibrarian(Librarian librarian, Menu menu, Scanner console) {

        int choice = 8;
        int previousChose;
        boolean redoAction = false;

        do {
            if (!redoAction) {
                displayMenu(menu.getTypeIn(), menu.getAdminMenu());
                System.out.println("\nYour chose is:");
                choice = Integer.parseInt(typedByUser(console));
            }


            switch (choice) {
                case 1:
                    System.out.println("You chose to " + menu.getAdminMenu()[1] + "\n");
                    Book newBook = new Book(console);
                    //Book newBook=new Book("Book9", "Author1", "B109", 3, 0);
                    librarian.addBook(newBook);
                    System.out.println(newBook.toString());
                    break;
                case 2:
                    System.out.println("You chose to " + menu.getAdminMenu()[2] + "\n");
                    break;
                case 3:
                    System.out.println("You chose to " + menu.getAdminMenu()[3] + "\n");
                    break;
                case 4:
                    System.out.println("You chose to " + menu.getAdminMenu()[4] + "\n");
                    break;
                case 5:
                    System.out.println("You chose to " + menu.getAdminMenu()[5] + "\n");
                    break;
                case 6:
                    System.out.println("You chose to " + menu.getAdminMenu()[6] + "\n");
                    break;
                case 7:
                    System.out.println("You chose to " + menu.getAdminMenu()[7] + "\n");
                    break;
                case 8:
                    System.out.println("You chose to " + menu.getAdminMenu()[8] + "\n");
                    break;
                default:
                    System.out.println("Unexpected chose, please try again from 0 to " +
                            (menu.getAdminMenu().length - 1) + " or type 0 to exit");
                    break;

            }


            previousChose = choice;
            System.out.println("Type " + previousChose + " to redo the action" +
                    ", type 0 to exit from librarian manu" +
                    "  or type any other key to return to the manu!\n");
            String debugS=typedByUser(console);
            choice = Integer.parseInt(debugS);

            if (choice == previousChose) {
                redoAction = true;
            }
        } while (choice != 0);

    }

    public static void actionsByStudent(Menu menu, Scanner console) {

        int choice = 7;
        int previousChose;
        boolean redoAction = false;

        do {
            if (!redoAction) {
                displayMenu(menu.getTypeIn(), menu.getAdminMenu());
                System.out.println("\nYour chose is:");
                choice = Integer.parseInt(typedByUser(console));
            }


            switch (choice) {
                case 1:
                    System.out.println("You chose to " + menu.getUserMenu()[1] + "\n");
                    break;
                case 2:
                    System.out.println("You chose to " + menu.getUserMenu()[2] + "\n");
                    break;
                case 3:
                    System.out.println("You chose to " + menu.getUserMenu()[3] + "\n");
                    break;
                case 4:
                    System.out.println("You chose to " + menu.getUserMenu()[4] + "\n");
                    break;
                case 5:
                    System.out.println("You chose to " + menu.getUserMenu()[5] + "\n");
                    break;
                case 6:
                    System.out.println("You chose to " + menu.getUserMenu()[6] + "\n");
                    break;
                case 7:
                    System.out.println("You chose to " + menu.getUserMenu()[7] + "\n");
                    break;
                default:
                    System.out.println("Unexpected chose, please try again from 0 to " +
                            (menu.getUserMenu().length - 1) + " or type 0 to exit");
                    break;

            }


            previousChose = choice;
            System.out.println("Type " + previousChose + " to redo the action" +
                    ", type 0 to exit from student manu" +
                    "  or type any other key to return to the manu!\n");
            choice = Integer.parseInt(typedByUser(console));
            if (choice == previousChose) {
                redoAction = true;
            }
        } while (choice != 0);

    }

    public static void debugApp() {
        //Debug
        /*
        //admin.displayBookDetails("B103");


        student.showAllAvailableBooks();
        student.borrowBook("B101");
        student.borrowBook("B101");
        student.borrowBook("B101");
        student.borrowBook("B102");
        student.showAllAvailableBooks();
        System.out.println("\n Books borrowed");
        student.displayBorrowedBooks();
        student.returnBook("B101");
        student.returnBook("B102");
        student.showAllAvailableBooks();
        System.out.println("\n Books borrowed");
        admin.displayBooksBorrowedByUser(student);
        student.isTheBookAvailableToBorrow("B101");

*/
        /*
        student.borrowBook("B101");
        student.showAllAvailableBooks();
        student.borrowBook("B101");
        student.showAllAvailableBooks();
*/
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


