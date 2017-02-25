package main.java.SpeculativeGenerality;

abstract class Taxpayer {
    protected abstract double getTaxPercentage();

    public double calculateTaxAmount(final long income) {
        if (getTaxPercentage() == 0)
            return 0;
        return income * getTaxPercentage() / 100.0;
    }
}
