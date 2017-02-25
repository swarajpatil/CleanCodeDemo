package main.java.GetterSetter;

public class BalanceReport {

    public void printBalance() {
        System.out.println("Total cash present in bank is" + totalBalance());
    }

    private double totalBalance() {
        Bank bank = new Bank();
        double totalAmount = 0;
        for (Account account : bank.getAccounts()) {
            totalAmount += (account.getBalance());
        }
        return totalAmount;
    }
}
