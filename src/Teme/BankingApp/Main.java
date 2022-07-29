package Teme.BankingApp;

public class Main {
    public static void main(String[] args) {
        BankAccount studentAccount = new StudentAccount(10000, "student1", 50000);
        BankAccount spendingAccount = new SpendingAccount(10000, "student1", 50000);
        //debug student acount
        /*
        System.out.println(studentAccount.getBalance());
        studentAccount.deposit(1000);
        System.out.println(studentAccount.getBalance());
        studentAccount.deposit(100000);
        System.out.println(studentAccount.getBalance());
        studentAccount.withdraw(2000);
        System.out.println(studentAccount.getBalance());
        studentAccount.withdraw(200000);
        System.out.println(studentAccount.getBalance());


        System.out.println(studentAccount.getBalance());
        spendingAccount.deposit(1000);
        System.out.println(spendingAccount.getBalance());
        spendingAccount.deposit(100000);
        System.out.println(spendingAccount.getBalance());
        spendingAccount.withdraw(2000);
        System.out.println(spendingAccount.getBalance());
        spendingAccount.withdraw(200000);
        System.out.println(spendingAccount.getBalance());
        */

    }
}
