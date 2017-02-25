package main.java.SpeculativeGenerality;

class Politician extends Taxpayer {
    private double taxPercentage = 0;

    @Override
    protected double getTaxPercentage() {
        return taxPercentage;
    }
}
