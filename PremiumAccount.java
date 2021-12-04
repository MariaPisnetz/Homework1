package Homework1;

public class PremiumAccount implements IAccount {
    protected int AccountNumber;

    protected double Balance;

    public PremiumAccount(int accountNumber) {
        this.AccountNumber = accountNumber;

        this.Balance = 0;


    }


    @Override
    public double Deposit(double amount) {
        Balance += amount;
        return Balance;

    }

    @Override
    public double Withdraw(double amount) {

            Balance = Balance - amount;
            return amount;
        }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNumber;
    }
}