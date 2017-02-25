package main.java.LongMethod;

public class Billing {
    final HotelRoomBooking hotelRoomBooking;

    public Billing(HotelRoomBooking hotelRoomBooking) {
        this.hotelRoomBooking = hotelRoomBooking;
    }


    public double calculateTaxes() {

        double convenienceCharges = 0;
        double convenienceChargePerDay = 100;
        if (hotelRoomBooking.getStayInDays() < 4)
            convenienceCharges = hotelRoomBooking.getBaseAmount() * 0.1 + hotelRoomBooking.getStayInDays() * convenienceChargePerDay;
        else
            convenienceCharges = hotelRoomBooking.getStayInDays() * convenienceChargePerDay;

        double serviceChargePerDay = 200;
        double serviceCharges = convenienceCharges + hotelRoomBooking.getStayInDays() * serviceChargePerDay;

        double serviceTax = 0;

        double serviceTaxRate = 0.12;
        if ((hotelRoomBooking.getBaseAmount() + serviceCharges + convenienceCharges) > 10000)
            serviceTax = (hotelRoomBooking.getBaseAmount() + serviceCharges + convenienceCharges) * serviceTaxRate;
        else
            serviceTax = hotelRoomBooking.getBaseAmount() * serviceTaxRate;

        double vatRate = 0.14;
        double valueAddedTax = hotelRoomBooking.getBaseAmount() * vatRate;

        double taxes = serviceCharges + serviceTax + valueAddedTax;
        return hotelRoomBooking.getBaseAmount() + taxes;
    }
}