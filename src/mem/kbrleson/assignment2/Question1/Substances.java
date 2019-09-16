package mem.kbrleson.assignment2.Question1;

// kbrleson@memphis.edu
// Sept 15th, 2019

public class Substances {
    // Define all of the substances' respective boiling/freezing temperature points (in Celsius)
    private static final double BEER_FREEZING_TEMP = -25.0;
    private static final double BEER_BOILING_TEMP = 99.0;

    private static final double WATER_FREEZING_TEMP = 0.0;
    private static final double WATER_BOILING_TEMP = 100.0;

    private static final double ALCOHOL_FREEZING_TEMP = -114.0;
    private static final double ALCOHOL_BOILING_TEMP = 78.0;

    private static final double OXYGEN_FREEZING_TEMP = -219.0;
    private static final double OXYGEN_BOILING_TEMP = -188.0;

    private double temperature;

    // Constructor
    public Substances(double temperature) {
        this.temperature = temperature;
    }

    // Run all of the the checkX methods
    public void checkAllSubstances() {
        this.checkBeer();
        this.checkWater();
        this.checkAlcohol();
        this.checkOxygen();
        System.out.println();
    }

    private void checkBeer() {
        if (this.temperature <= BEER_FREEZING_TEMP) {
            // Check if the temperature is less than or equal to the freezing temp
            System.out.println("Beer will freeze");
        } else if (this.temperature >= BEER_BOILING_TEMP) {
            // Check if the temperature is greater than or equal to the boiling temp
            System.out.println("Beer will boil");
        }
    }

    private void checkWater() {
        if (this.temperature <= WATER_FREEZING_TEMP) {
            System.out.println("Water will freeze");
        } else if (this.temperature >= WATER_BOILING_TEMP) {
            System.out.println("Water will boil");
        }
    }

    private void checkAlcohol() {
        if (this.temperature <= ALCOHOL_FREEZING_TEMP) {
            System.out.println("Alcohol will freeze");
        } else if (this.temperature >= ALCOHOL_BOILING_TEMP) {
            System.out.println("Alcohol will boil");
        }
    }

    private void checkOxygen() {
        if (this.temperature <= OXYGEN_BOILING_TEMP && this.temperature > OXYGEN_FREEZING_TEMP) {
            System.out.println("Oxygen will boil");
        } else if (this.temperature <= OXYGEN_FREEZING_TEMP) {
            System.out.println("Oxygen will freeze");
        }
    }
}


