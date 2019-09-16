package mem.kbrleson.assignment1.Question6;

// kbrleson@memphis.edu
// Sept 8th, 2019

import java.util.Arrays;
import java.util.Objects;

public class GroceryList {
    private GroceryItem[] groceryItems = new GroceryItem[10];

    public double getTotalCost() {
        return Arrays.stream(this.groceryItems)
                .filter(Objects::nonNull)
                .mapToDouble(GroceryItem::getCost).sum();
    }

    public void display() {
        if (this.groceryItems[0] != null) {
            if (this.groceryItems[9] != null) {
                System.out.println("\n--Grocery List (FULL)--");
            } else {
                System.out.println("\n-----Grocery List-----");
            }

            System.out.println(String.join("\n", toStringArray(this.groceryItems)));
            System.out.println("----------------------");
            System.out.println("TOTAL: $" + String.format("%.2f", this.getTotalCost()));
            System.out.println("----------------------\n");
            return;
        }

        System.out.println("\nGrocery list is empty!\n");
    }

    public boolean add(GroceryItem newItem) {
        boolean didAdd = false;

        for (int curr = 0; curr < this.groceryItems.length; curr++) {
            if (this.groceryItems[curr] == null && !didAdd) {
                didAdd = true;
                this.groceryItems[curr] = newItem;
            }
        }

        return didAdd;
    }

    private static String[] toStringArray(GroceryItem[] groceryItems) {
        return Arrays.stream(groceryItems)
                .filter(Objects::nonNull)
                .map(GroceryItem::toString).toArray(String[]::new);
    }
}
