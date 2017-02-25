package main.java.GetterSetter;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> Accounts = new ArrayList<>();

    public void addAccount(Account Account) {
        Accounts.add(Account);
    }

    public void removeAccount() {
        Accounts.remove(Accounts);
    }

    public ArrayList<Account> getAccounts() {
        return Accounts;
    }
}
