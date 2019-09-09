package mem.kbrleson.assignment1.Question6;

// kbrleson@memphis.edu
// Sept 8th, 2019

@SuppressWarnings("WeakerAccess")
public class GroceryItem {
    public String name;

    private int quantity;
    private double pricePerUnit;

    GroceryItem(String name, int quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    GroceryItem(String name, double pricePerUnit) {
        this.name = name;
        this.quantity = 1;
        this.pricePerUnit = pricePerUnit;
    }

    public double getCost() {
        return Math.round((this.pricePerUnit * (double) this.quantity) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Quantity: " + this.quantity + ", Total Cost: $" + String.format("%.2f", this.getCost());
    }
}
