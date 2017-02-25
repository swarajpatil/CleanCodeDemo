package main.java.GetterSetter;

public class Receipt {
    private final Cab cab;

    public Receipt(Cab cab) {
        this.cab = cab;
    }

    public double totalCost() {
        double totalCost = 0;

        // fixed charges
        totalCost += 50;

        // taxi charges
        int totalKms = cab.getTotalKms();
        double peakTimeMultiple = cab.isPeakTime() ? 1.2 : 1.0;
        if (cab.isAirConditioned()) {
            totalCost += Math.min(10, totalKms) * 20 * peakTimeMultiple;
            totalCost += Math.max(0, totalKms - 10) * 17 * peakTimeMultiple;
        } else {
            totalCost += Math.min(10, totalKms) * 15 * peakTimeMultiple;
            totalCost += Math.max(0, totalKms - 10) * 12 * peakTimeMultiple;
        }

        return totalCost;
    }
}