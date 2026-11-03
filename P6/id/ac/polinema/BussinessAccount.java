package P6.id.ac.polinema;

public class BussinessAccount extends Account {
    private double monthlyTransactionFee;

    public BussinessAccount(String accountNumber, Customer owner, double balance, double monthlyTransactionFee) {
        super(accountNumber, owner, balance);
        this.monthlyTransactionFee = monthlyTransactionFee;
    }

    public double getMonthlyTransactionFee() {
        return monthlyTransactionFee;
    }

    public void printAccountType() {
        System.out.println("Account type: Business Monthly fee:" + monthlyTransactionFee);
    }
}