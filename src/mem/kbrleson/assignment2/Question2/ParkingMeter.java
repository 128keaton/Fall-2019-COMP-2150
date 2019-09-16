package mem.kbrleson.assignment2.Question2;

public class ParkingMeter {
    private double minutesPurchased;

    public ParkingMeter(double minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    public double getMinutesPurchased() {
        return minutesPurchased;
    }

    public double getMinutesIllegallyParked(double minutesParked) {
        return minutesParked - this.minutesPurchased;
    }
}
