package main.java.Comments;

class Product {
    public boolean IsTaxable;
    public double tax;
    public boolean IsImported;
    public double itemRate;
    public int numberOfItems;

    public double finalAmount() {

        // Calculate tax rate for final amount calculation by adding tax to item rate
        double taxedRate = 0;
        if (IsTaxable) {
            tax = itemRate * 5 / 100;
        }
        if (IsImported) {
            tax += itemRate * 10 / 100;
        }
        taxedRate = itemRate + tax;

        // Return the final amount
        double fFinalAmount = taxedRate * numberOfItems;
        return fFinalAmount;
    }
}
