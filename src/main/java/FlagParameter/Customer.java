package main.java.FlagParameter;

public class Customer {
    private final String name;
    private boolean isPrimeUser;
    private boolean primeUser;

    public Customer(String Name, boolean isPrimeUser) {
        name = Name;
        this.isPrimeUser = isPrimeUser;
    }

    public boolean isPrimeUser() {
        return primeUser;
    }
}
