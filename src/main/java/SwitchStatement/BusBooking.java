package main.java.SwitchStatement;

public class BusBooking {

    public String[] getNamesForBusType(BusType cabType) {
        switch (cabType) {
            case Seating: {
                return new String[]{"Indica", "Etios", "Wagnor", "Swift Dzire", "Mahindra Verito"};
            }
            case NonACSleeper: {
                return new String[]{"Toyota Camry", "Honda Accord", "Ford Escape"};
            }
            case ACSleeper: {
                return new String[]{"Mahindra XUV", "Scorpio", "Creta"};
            }
        }
        return null;
    }
}
