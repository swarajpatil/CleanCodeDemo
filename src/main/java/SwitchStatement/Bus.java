package main.java.SwitchStatement;

public class Bus {

    private BusType type;
    private int travelTime;
    private int distance;

    public Bus(BusType type) {
        this.type = type;
    }

    public double calculateFare() {
        double fare = 0;
        switch (type) {
            case Seating: {
                fare = 100 + 1.5 * travelTime + 10 * distance;
            }
            case NonACSleeper: {
                fare = 120 + 1 * travelTime + 12 * distance;
            }
            case ACSleeper: {
                fare = 150 + 2 * travelTime + 14 * distance;
            }
        }
        return fare;
    }

    public double promotionalFare() {
        double fare = 0;
        switch (type) {
            case Seating: {
                if (distance > 10) {
                    fare = (40 + 1 * travelTime + 6 * (0.5 * distance)) - 40;
                } else {
                    fare = (40 + 1 * travelTime + 6 * distance) - 30;
                }

            }
            case NonACSleeper: {
                if (travelTime > 60) {
                    fare = 45 + 1 * (0.5 * travelTime) + 9 * distance;
                } else {
                    fare = (45 + 1 * travelTime + 9 * distance) - 40;
                }
            }
            case ACSleeper: {
                if (distance > 12) {
                    fare = 80 + 2 * travelTime + 14 * (0.6 * distance);
                } else {
                    fare = (80 + 2 * travelTime + 14 * distance) - 50;
                }
            }
        }
        return fare;
    }
}
