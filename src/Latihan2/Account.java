
package Latihan2;

public class Account {
    String accNo;
    double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account No: " + accNo + ", Balance: " + balance);
    }
}

