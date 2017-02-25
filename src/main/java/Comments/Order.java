package main.java.Comments;

public class Order {

    private String address;
    private double baseTotalAmount;

    public double amount() {
        // add service tax to base total amount
        return baseTotalAmount += getServiceTax(baseTotalAmount);
    }

    // Get service tax on total amount
    public double getServiceTax(double totalAmount) {
        // Get country code
        String countryCode = getCountryCode(address);

        // If country is USA then service tax is 5%
        if (countryCode == "USA") {
            return totalAmount * 5 / 100;
        }

        // If country is India then service tax is 14%
        if (countryCode == "IND") {
            return totalAmount * 14 / 100;
        }

        // For other countries service tax is 7%
        return totalAmount * 7 / 100;
    }

    private String getCountryCode(String address) {
        if (address.contains("United States"))
            return "USA";
        if (address.contains("India"))
            return "IND";

        return "Other";
    }
}
