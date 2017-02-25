package main.java.SpeculativeGenerality;

public class MiddleClass extends Taxpayer {
    private final double taxPercentage = 10;

    @Override
    protected double getTaxPercentage() {
        return taxPercentage;
    }
}
