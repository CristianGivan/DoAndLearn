package Curs.C220726;

public class User {
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) throws InvalidEmailException{
        if (!emailAddress.contains("@")){
            throw new InvalidEmailException("Your email is not valid!");
        }

        this.emailAddress = emailAddress;

    }

    private String emailAddress;

}
