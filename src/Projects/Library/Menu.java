package Projects.Library;

public class Menu {

    private final String[] typeIn = {"Type in 0 to ", "Type in 1 to ", "Type in 2 to ", "Type in 3 to ", "Type in 4 to ",
            "Type in 5 to ", "Type in 6 to ", "Type in 7 to ", "Type in 8 to ", "Type in 9 to ",
            "Type in 10 to ", "Type in 11 to ", "Type in 12 to ", "Type in 13 to ", "Type in 14 to "};
    private String[] logIn;
    private String[] adminMenu;

    private String[] userMenu;

    public Menu() {
        setLogIn();
        setAdminMenu();
        setUserMenu();
    }



    private void setLogIn() {
        this.logIn = new String[4];
        this.logIn[0] = "exit";
        this.logIn[1] = "log in";
        this.logIn[2] = "register";
        this.logIn[3] = "help";
    }

    public void setAdminMenu() {
        this.adminMenu = new String[9];
        this.adminMenu[0] = "exit from librarian manu";
        this.adminMenu[1] = "add new book in library base on ISBN";
        this.adminMenu[2] = "delete a book from library base of ISBN";
        this.adminMenu[3] = "delete a copy of a book base on ISBN";
        this.adminMenu[4] = "display the details for all the books";
        this.adminMenu[5] = "display the book details base on ISBN";
        this.adminMenu[6] = "display all the books borrowed by a student";
        this.adminMenu[7] = "log out";
        this.adminMenu[8] = "help";
    }
    public void setUserMenu() {
        this.userMenu = new String[7];
        this.userMenu[0] = "exit from student menu";
        this.userMenu[1] = "check if a book is available to borrow base on ISBN";
        this.userMenu[2] = "display all available books to borrow";
        this.userMenu[3] = "borrow a book base on ISBN";
        this.userMenu[4] = "return a book base on ISBN";
        this.userMenu[5] = "log out";
        this.userMenu[6] = "help";

    }

    public String[] getTypeIn() {
        return typeIn;
    }

    public String[] getLogIn() {
        return logIn;
    }

    public String[] getAdminMenu() {
        return adminMenu;
    }

    public String[] getUserMenu() {
        return userMenu;
    }
}
