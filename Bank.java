package Homework1;

import java.util.*;

public class Bank implements IBank{
    public List<IAccount> accountsList;

    public Bank() {
        accountsList = new ArrayList<IAccount>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accountsList.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        int i;
        boolean exist = false;
        for (i=0;i<accountsList.size();i++) {
            if (accountsList.get(i).GetAccountNumber() == accountNumber)
            {
                if (accountsList.get(i).GetCurrentBalance()>0)
                {
                    accountsList.remove(i);
                    System.out.println("The account was removed, positive balance");
                }
                else if (accountsList.get(i).GetCurrentBalance() == 0)
                {
                    accountsList.remove(i);
                    System.out.println("The account was removed, at balance 0");
                }
                else {
                    System.out.println("The account owes money, can't be closed");
                    exist = true;
                }

        }
        if (exist ==  false){
            System.out.println("Such account does not exist");
    }}}

    @Override
    public List<IAccount> GetAllAccount() {
            return accountsList;
        }


    @Override
    public List<IAccount> GetAllAccountInDebt() {
        List <IAccount> negativeBalance = new ArrayList <IAccount>();
        int i;
        for (i=0; i<accountsList.size();i++) {
            if (accountsList.get(i).GetCurrentBalance()<0)
                negativeBalance.add(accountsList.get(i));
        }
        return negativeBalance;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List <IAccount> moreMoney = new ArrayList <IAccount>();
        int i;
        for(i=0;i<accountsList.size();i++) {
            if (accountsList.get(i).GetCurrentBalance()>balanceAbove)
                moreMoney.add(accountsList.get(i));
        }
        return moreMoney;
    }
}
