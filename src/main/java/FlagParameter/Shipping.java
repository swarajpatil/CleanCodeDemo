package main.java.FlagParameter;

public class Shipping {

    public double getDeliveryChanges(double total, boolean isPrime) {
        if (isPrime) {
            if (total < 500) {
                return total * 0.1;
            } else {
                return 0;
            }
        } else {
            if (total < 1000) {
                return total * 0.2;
            } else {
                return 0;
            }
        }
    }
}
