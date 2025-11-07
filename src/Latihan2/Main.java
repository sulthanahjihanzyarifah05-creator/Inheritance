
package Latihan2;

public class Main {
    
    public static void main(String[] args) {
        // Buat array Account berisi berbagai jenis akun
        Account[] accounts = new Account[4];
        accounts[0] = new SavingsAccount("SA001", 1000, 0.05);
        accounts[1] = new CheckingAccount("CA001", 2000, 500);
        accounts[2] = new SavingsAccount("SA002", 3000, 0.03);
        accounts[3] = new CheckingAccount("CA002", 1500, 300);

        // Iterasi seluruh akun
        for (Account acc : accounts) {
            acc.displayInfo();

            // Periksa apakah SavingsAccount
            if (acc instanceof SavingsAccount) {
                // Casting ke SavingsAccount
                SavingsAccount sa = (SavingsAccount) acc;
                sa.addInterest();
            }

            System.out.println();
        }
    }
}
