package Homework1;

public class Main {
    public static void main(String[] args) {

        StandardAccount one = new StandardAccount(123456,-50);
        one.Balance = 1000;
        one.Deposit(5000);


        System.out.println(one.Balance);
        System.out.println(one.Withdraw(12000));
        System.out.println(one.Balance);

        System.out.println(one.GetAccountNumber());
        System.out.println(one.GetCurrentBalance());

        System.out.println("Second account check");

        BasicAccount two = new BasicAccount(124444,100);
        two.Balance = 1000;
        two.Deposit(5000);


        System.out.println(two.Balance);
        System.out.println(two.Withdraw(50));
        System.out.println(two.Balance);

        System.out.println(two.GetAccountNumber());
        System.out.println(two.GetCurrentBalance());
        System.out.println(two.WithdrawalLimit);


        System.out.println("Third account check");

        PremiumAccount three = new PremiumAccount(007);
        three.Balance = 1000000;
        three.Deposit(500000);


        System.out.println(three.Balance);
        System.out.println(three.Withdraw(7000));
        System.out.println(three.Balance);

        System.out.println(three.GetAccountNumber());
        System.out.println(three.GetCurrentBalance());

        System.out.println("Checking Bank operations");



        Bank Discount = new Bank();

        Discount.OpenAccount(new BasicAccount(21111,1000));
        Discount.OpenAccount(new PremiumAccount(2221111));
        Discount.OpenAccount(new StandardAccount(777,10000));
        Discount.GetAllAccount();
        System.out.println(Discount.accountsList);
        Discount.CloseAccount(2221111);
        System.out.println(Discount.GetAllAccountsWithBalance(-1));
        System.out.println(Discount.GetAllAccountInDebt());
        System.out.println(Discount.accountsList.get(0).GetAccountNumber());
















    }

}
