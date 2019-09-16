package mem.kbrleson.assignment2.Question2;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licencePlateNumber;
    private Double minutesParked;

    public ParkedCar(String make, String model, String color, String licencePlateNumber, Double minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licencePlateNumber = licencePlateNumber;
        this.minutesParked = minutesParked;
    }

    public Double getMinutesParked() {
        return minutesParked;
    }

    @Override
    public String toString() {
       String output = "Make: " + make + "\n";
       output = output + "Model: " + model  + "\n";
       output = output + "Color: " + color + "\n";
       output = output + "Licence Plate Number: " + licencePlateNumber + "\n";
       output = output + "Minutes Parked: " + minutesParked + "\n";

       return output;
    }
}
