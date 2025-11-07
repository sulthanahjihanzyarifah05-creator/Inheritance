
package Latihan2;

public class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance); // panggil constructor Account
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added! New balance: " + balance);
    }

    @Override
    public void displayInfo() {
        System.out.println("Savings Account [" + accNo + "] - Balance: " + balance + ", Interest Rate: " + (interestRate * 100) + "%");
    }
}
