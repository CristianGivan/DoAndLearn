package Curs.C220726;

public class OnlineShop {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.setEmailAddress("test");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }
}
