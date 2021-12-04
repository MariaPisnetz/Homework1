package Homework1;

public class BasicAccount implements IAccount{
    protected  int AccountNumber;
    protected  double CreditLimit;
    protected double Balance;
    protected double WithdrawalLimit;

    public BasicAccount (int accountNumber, double withdrawalLimit){
        this.AccountNumber = accountNumber;
        this.CreditLimit = 0;
        this.Balance = 0;
        this.WithdrawalLimit = withdrawalLimit;

    }

    @Override
    public double Deposit(double amount) {
        Balance += amount;
        return Balance;


    }

    @Override
    public double Withdraw(double amount) {

        if ((amount<=Balance-CreditLimit)&amount<=WithdrawalLimit&amount>0){
            Balance = Balance - amount;
            return amount;
        }

        else if ((amount<=Balance-CreditLimit)&amount>WithdrawalLimit&amount>0){
            Balance = Balance - WithdrawalLimit;
            return WithdrawalLimit;
        }

        else if ((amount>Balance-CreditLimit)&amount>0){
            Balance = Balance - WithdrawalLimit;
            return WithdrawalLimit;

        }
        else return 0;
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



