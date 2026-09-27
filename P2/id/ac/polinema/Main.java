package P2.id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        // untuk Tugas mandirinya
        Account from = new Account("Nadia", 500000);
        Account to = new Account("Budi", 200000);

        from.transferTo(to, 100000);
        from.printInfo();
        to.printInfo();
        // Account acc = new Account("Nadia", 500000);
        // acc.ownerName = "Nadia";
        // acc.balance = 500000.0;
        // acc.deposit(500000.0);
        // acc.withdraw(150000.0);
        // acc.printInfo();
        // System.out.println("Formatted Balance : " + acc.formatBalance());
        // acc.withdraw(1000000);
        // acc.printInfo();
        // System.out.println(acc.ownerName + " - Balance: " + acc.balance);
    }
}