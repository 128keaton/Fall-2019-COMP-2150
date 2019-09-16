package mem.kbrleson.assignment2.Question2;

public class ParkingTicket {
    private static final double BASE_FINE = 35.0;
    private static final double HOURLY_FINE = 10.0;

    private ParkedCar ticketedCar;
    private PoliceOfficer ticketingOfficer;
    private ParkingMeter atMeter;

    public ParkingTicket(ParkedCar ticketedCar, PoliceOfficer ticketingOfficer, ParkingMeter atMeter) {
        this.ticketedCar = ticketedCar;
        this.ticketingOfficer = ticketingOfficer;
        this.atMeter = atMeter;
    }

    public double getFine() {
        double illegalMinutes = this.atMeter.getMinutesIllegallyParked(this.ticketedCar.getMinutesParked());

        if (illegalMinutes == 0) {
            return illegalMinutes;
        }

        double currentFine = BASE_FINE;

        while (illegalMinutes > 0) {
            currentFine = currentFine + HOURLY_FINE;
            illegalMinutes = illegalMinutes - 60;
        }

        return currentFine;
    }

    @Override
    public String toString() {
        return "Fine: " + this.getFine() + "\nOfficer: " + this.ticketingOfficer;
    }
}
