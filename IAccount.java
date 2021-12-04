package Homework1;

public interface IAccount {
    double Deposit(double amount);
    double Withdraw (double amount);
    double GetCurrentBalance();
    int GetAccountNumber();
}
