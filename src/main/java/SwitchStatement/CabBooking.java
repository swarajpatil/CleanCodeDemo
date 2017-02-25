package main.java.SwitchStatement;

public class CabBooking {

    public String[] getCarNamesForCabType(CabType cabType) {
        switch (cabType) {
            case uberGO: {
                return new String[]{"Indica", "Etios", "Wagnor", "Swift Dzire", "Mahindra Verito"};
            }
            case uberX: {
                return new String[]{"Toyota Camry", "Honda Accord", "Ford Escape"};
            }
            case uberSUV: {
                return new String[]{"Mahindra XUV", "Scorpio", "Creta"};
            }
        }
        return null;
    }
}
