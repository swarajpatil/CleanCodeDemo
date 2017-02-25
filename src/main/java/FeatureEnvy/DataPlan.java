package main.java.FeatureEnvy;

public class DataPlan {

    private double rental;
    private double dataLimit;
    private double additionalCharge;

    public DataPlan(double rental, double dataLimit, double additionalCharge) {
        this.rental = rental;
        this.dataLimit = dataLimit;
        this.additionalCharge = additionalCharge;
    }

    double getBillAmount(double dataUsage) {
        double billAmount = rental;
        if (dataUsage > dataLimit) {
            billAmount += dataUsage * additionalCharge;
        }
        return billAmount;
    }
}
