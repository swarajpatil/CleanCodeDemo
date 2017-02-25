package main.java.LongMethod;


public class Room {
    private String number;
    private double perDayCharges;

    public Room(String number, double perDayCharges) {
        this.number = number;
        this.perDayCharges = perDayCharges;
    }

    public double getPerDayCharges() {
        return perDayCharges;
    }

    public String getNumber() {
        return number;
    }
}
