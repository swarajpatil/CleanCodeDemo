package main.java.FlagParameter;

public class RateCard {

    private double weekDayPrice;
    private double weekendPrice;
    private double weekDayServiceTax;
    private double weekendServiceTax;

    public RateCard(double weekDayPrice, double weekendPrice, double weekDayServiceTax, double weekendServiceTax) {

        this.weekDayPrice = weekDayPrice;
        this.weekendPrice = weekendPrice;
        this.weekDayServiceTax = weekDayServiceTax;
        this.weekendServiceTax = weekendServiceTax;
    }

    public double getPrice(Integer noOfDays, Boolean isWeekend) {
        if (isWeekend) {
            return noOfDays * weekendPrice + (noOfDays * 2000) * weekendServiceTax;
        } else {
            return noOfDays * weekDayPrice + (noOfDays * 2000) * weekDayServiceTax;
        }
    }
}
