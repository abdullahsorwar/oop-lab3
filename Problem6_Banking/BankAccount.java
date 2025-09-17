public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double openingBalance){
        // TODO: initialize fields, increment totalAccounts
        throw new UnsupportedOperationException("TODO");
    }

    public void deposit(double amount){
        // TODO: positive only
        throw new UnsupportedOperationException("TODO");
    }

    public boolean withdraw(double amount){
        // TODO: positive and <= balance
        throw new UnsupportedOperationException("TODO");
    }

    public boolean transferTo(BankAccount other, double amount){
        // TODO: withdraw from this and deposit to other atomically
        throw new UnsupportedOperationException("TODO");
    }

    public static int getTotalAccounts(){ return totalAccounts; }
    public double getBalance(){ return balance; }
}
