package Teme.BankingApp;

public class Person {
    private String firstName;
    private String lastName;

    private int maximNumberOfAcounts;
    private int numberOfAcounts;
    private BankAccount[] accountsList;

    //? cum am putea sa facem o alocare dinamica a numerului de arrayuri

    public Person(String firstName, String lastName, int maximNumberOfAcounts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfAcounts = 0;
        this.maximNumberOfAcounts = maximNumberOfAcounts;
        accountsList = new BankAccount[numberOfAcounts];
    }

    public boolean addAccount(BankAccount bankAccount) {
        if (numberOfAcounts < maximNumberOfAcounts) {
            accountsList[numberOfAcounts] = bankAccount;
            numberOfAcounts++;
            return true;
        }
        return false;
    }

    public void listAccount() {
        for (int i = 0; i < numberOfAcounts; i++) {
            System.out.println("Account number " + accountsList[i].getAccountNumber() + " has the balance: " +
                    accountsList[i].getBalance());
        }
    }
}
