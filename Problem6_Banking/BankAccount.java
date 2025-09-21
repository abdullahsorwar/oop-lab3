public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double openingBalance){
        // TODO: initialize fields, increment totalAccounts
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
        totalAccounts++;
        // throw new UnsupportedOperationException("TODO");
    }

    public void deposit(double amount){
        // TODO: positive only
        if (amount > 0) {
            balance += amount;
            return;
        }
        else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public boolean withdraw(double amount){
        // TODO: positive and <= balance
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public boolean transferTo(BankAccount other, double amount){
        // TODO: withdraw from this and deposit to other atomically
        if (this.withdraw(amount)) {
            other.deposit(amount);
            return true;
        }
        else {
            return false;
        }
        // throw new UnsupportedOperationException("TODO");
    }

    public static int getTotalAccounts(){ return totalAccounts; }
    public double getBalance(){ return balance; }
}
