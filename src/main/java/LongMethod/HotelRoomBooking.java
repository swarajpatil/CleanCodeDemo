package main.java.LongMethod;

public class HotelRoomBooking {
    private String customerName;
    private Room room;
    private Integer stayInDays;
    private double baseAmount;

    public HotelRoomBooking(String customerName, Room room, Integer stayInDays) {
        this.customerName = customerName;
        this.room = room;
        this.stayInDays = stayInDays;
    }

    public void baseCharges() {
        baseAmount = stayInDays * room.getPerDayCharges();
    }

    public double billAmount() {
        return getBaseAmount() + new Billing(this).calculateTaxes();
    }

    public void printReceipt() {
        baseCharges();
        System.out.println("Name: " + customerName);
        System.out.println("Room Number: " + room.getNumber());
        System.out.println("Total Charges: " + billAmount());
    }

    public Integer getStayInDays() {
        return stayInDays;
    }

    public double getBaseAmount() {
        return baseAmount;
    }


}
