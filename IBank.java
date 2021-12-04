package Homework1;
import java.util.*;

public interface IBank {
    void OpenAccount(IAccount account);
    void CloseAccount(int accountNumber);
    List <IAccount> GetAllAccount();
    List <IAccount> GetAllAccountInDebt();
    List <IAccount> GetAllAccountsWithBalance(double balanceAbove);
    }
