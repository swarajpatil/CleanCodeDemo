package main.java.GetterSetter;

public class FixedDepositReport {
    public void print() {
        Bank bank = new Bank();
        for (Account account : bank.getAccounts()) {
            if (account.getType() == "Fixed Deposit") {
                System.out.print("Account holder name: " + account.getName());
                System.out.println("Deposit Amount: " + account.getBalance());
            }
        }
    }
}
