package mem.kbrleson.assignment2.Question2;

public class PoliceOfficer {
    private String name;
    private int badgeNumber;

    public PoliceOfficer(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public ParkingTicket issueTicket(ParkedCar toParkedCar, ParkingMeter atMeter) {
        Double minutesParked = toParkedCar.getMinutesParked();
        Double minutesPurchased = atMeter.getMinutesPurchased();

        if (minutesPurchased >= minutesParked) {
            return null;
        }

        return new ParkingTicket(toParkedCar, this, atMeter);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBadge Number: " + badgeNumber;
    }
}
