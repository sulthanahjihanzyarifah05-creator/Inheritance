
package Latihan2;

public class CheckingAccount extends Account {
    double overdraftLimit;

    public CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayInfo() {
        System.out.println("Checking Account [" + accNo + "] - Balance: " + balance + ", Overdraft Limit: " + overdraftLimit);
    }
}