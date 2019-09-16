package mem.kbrleson.assignment2.Question2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        double timePurchased, timeParked;

        System.out.print("Enter the parking time purchased (mins): ");
        timePurchased = scanner.nextDouble();

        System.out.print("Enter the actual time parked in front of the meter (mins) : ");
        timeParked = scanner.nextDouble();

        PoliceOfficer meterMaid = new PoliceOfficer("Meter Maid", 8899);
        ParkedCar parkedCar = new ParkedCar("Model T", "1908", "Red", "1ZZZTOP", timeParked);
        ParkingMeter parkingMeter = new ParkingMeter(timePurchased);
        ParkingTicket parkingTicket = meterMaid.issueTicket(parkedCar, parkingMeter);

        System.out.println();
        System.out.println("Car Data:");
        System.out.println(parkedCar);

        System.out.println("Officer Data:");
        System.out.println(meterMaid);

        System.out.println();
        System.out.println("Minutes Illegally Parked: " + parkingMeter.getMinutesIllegallyParked(timeParked));

        if (parkingTicket != null) {
            System.out.println("Fine: $" +  String.format("%.2f", parkingTicket.getFine()));
        } else {
            System.out.println("Car has not parked over time purchased");
        }
    }
}
