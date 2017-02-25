package main.java.SwitchStatement;

public class Cab {

    private CabType type;
    private int travelTime;
    private int distance;

    public Cab(CabType type) {
        this.type = type;
    }

    public double calculateFare() {
        double fare = 0;
        switch (type) {
            case uberGO: {
                fare = 40 + 1.5 * travelTime + 6 * distance;
            }
            case uberX: {
                fare = 45 + 1 * travelTime + 9 * distance;
            }
            case uberSUV: {
                fare = 80 + 2 * travelTime + 14 * distance;
            }
        }
        return fare;
    }

    public double promotionalRideFare() {
        double fare = 0;
        switch (type) {
            case uberGO: {
                if (distance > 10) {
                    fare = (40 + 1 * travelTime + 6 * (0.5 * distance)) - 40;
                } else {
                    fare = (40 + 1 * travelTime + 6 * distance) - 30;
                }

            }
            case uberX: {
                if (travelTime > 60) {
                    fare = 45 + 1 * (0.5 * travelTime) + 9 * distance;
                } else {
                    fare = (45 + 1 * travelTime + 9 * distance) - 40;
                }
            }
            case uberSUV: {
                if (distance > 12) {
                    fare = 80 + 2 * travelTime + 14 * (0.6 * distance);
                } else {
                    fare = (80 + 2 * travelTime + 14 * distance) - 50;
                }
            }
        }
        return fare;
    }

    public double minimumFare() {
        double fare = 0;
        switch (type) {
            case uberGO: {
                if (distance < 5)
                    fare = 40;
                else
                    fare = 50;
            }
            case uberX: {
                if (distance < 5)
                    fare = 50;
                else
                    fare = 60;
            }
            case uberSUV: {
                if (distance < 5)
                    fare = 80;
                else
                    fare = 100;
            }
        }
        return fare;
    }

    public double cancellationCharges() {
        double cancellationCharges = 0;
        switch (type) {
            case uberGO: {
                cancellationCharges = 60;
            }
            case uberX: {
                cancellationCharges = 90;
            }
            case uberSUV: {
                cancellationCharges = 100;
            }
        }
        return cancellationCharges;
    }
}
