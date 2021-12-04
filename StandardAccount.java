package Homework1;

public class StandardAccount implements IAccount {
    protected  int AccountNumber;
    protected  double CreditLimit;
    protected double Balance; 

    public StandardAccount (int accountNumber, double creditLimit)
    {
        this.AccountNumber = accountNumber;
        this.CreditLimit = creditLimit;
        this.Balance = 0;

    }

    @Override
    public double Deposit(double amount) {
        Balance += amount;
        return Balance;


    }

    @Override
    public double Withdraw(double amount) {

        if (amount<=(Balance-CreditLimit)){
            Balance = Balance - amount;
            return amount;
        }

        else {
            double cashWithdrawl = Balance-CreditLimit;
            Balance = Balance - cashWithdrawl;
            return cashWithdrawl;

        }

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

