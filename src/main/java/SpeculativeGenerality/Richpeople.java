package main.java.SpeculativeGenerality;

class Richpeople extends Taxpayer {
    private final double taxPercentage = 30;

    @Override
    protected double getTaxPercentage() {
        return taxPercentage;
    }
}
