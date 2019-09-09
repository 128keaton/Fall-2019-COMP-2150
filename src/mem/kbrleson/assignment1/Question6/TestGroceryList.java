package mem.kbrleson.assignment1.Question6;

// kbrleson@memphis.edu
// Sept 8th, 2019

public class TestGroceryList {
    public static void main(String[] args) {
        // MARK: Creation (Test)
        System.out.println("Creating empty grocery list");
        GroceryList groceryList = new GroceryList();

        groceryList.display(); // Should print "Grocery list is empty!"

        // MARK: Adding Items (Test)
        System.out.println("Adding two items");
        GroceryItem milk = new GroceryItem("Milk", 2.30);
        GroceryItem yogurts = new GroceryItem("Yogurt", 3, 1.65);

        groceryList.add(milk);
        groceryList.add(yogurts);

        // Should Print:
        // -----Grocery List-----
        // Name: Milk, Quantity: 1, Total Cost: $2.30
        // Name: Yogurt, Quantity: 3, Total Cost: $4.95
        // ----------------------
        groceryList.display();

        System.out.println("Adding two MORE items");
        GroceryItem juice = new GroceryItem("Juice", 2, 6.99);
        GroceryItem coffeeFilters = new GroceryItem("Coffee Filters", 2, 1.65);

        groceryList.add(juice);
        groceryList.add(coffeeFilters);

        // Should Print:
        // -----Grocery List-----
        // Name: Milk, Quantity: 1, Total Cost: $2.30
        // Name: Yogurt, Quantity: 3, Total Cost: $4.95
        // Name: Juice, Quantity: 2, Total Cost: $13.98
        // Name: Coffee Filters, Quantity: 2, Total Cost: $3.30
        // ----------------------
        groceryList.display();

        System.out.println("Adding six MORE items");
        GroceryItem toiletPaper = new GroceryItem("Toilet Paper", 2, 12.55);
        GroceryItem gum = new GroceryItem("Chewing Gum", 4, 0.45);
        GroceryItem pencils = new GroceryItem("Pencils", 2, 1.99);
        GroceryItem bread = new GroceryItem("Bread", 2.34);
        GroceryItem eggs = new GroceryItem("Eggs", 3.12);
        GroceryItem chips = new GroceryItem("Chips", 2, 2.20);

        groceryList.add(toiletPaper);
        groceryList.add(gum);
        groceryList.add(pencils);
        groceryList.add(bread);
        groceryList.add(eggs);
        groceryList.add(chips);

        // Should Print:
        // --Grocery List (FULL)--
        // Name: Milk, Quantity: 1, Total Cost: $2.30
        // Name: Yogurt, Quantity: 3, Total Cost: $4.95
        // Name: Juice, Quantity: 2, Total Cost: $13.98
        // Name: Coffee Filters, Quantity: 2, Total Cost: $3.30
        // Name: Toilet Paper, Quantity: 2, Total Cost: $25.10
        // Name: Chewing Gum, Quantity: 4, Total Cost: $1.80
        // Name: Pencils, Quantity: 2, Total Cost: $3.98
        // Name: Bread, Quantity: 1, Total Cost: $2.34
        // Name: Eggs, Quantity: 1, Total Cost: $3.12
        // Name: Chips, Quantity: 2, Total Cost: $4.40
        // ----------------------
        // TOTAL: $65.27
        // ----------------------
        groceryList.display();


        // MARK: Adding an item to a full list (Test)
        System.out.println("Adding one more item (should not add, as we are at 10 items)");
        GroceryItem junkFood = new GroceryItem("Twinkies", 4.23);

        if (groceryList.add(junkFood)) {
            System.out.println("Added " + junkFood.name);
        } else {
            System.out.println("You should watch what you eat! No junk food for you!");
        }


        // Should Print:
        // --Grocery List (FULL)--
        // Name: Milk, Quantity: 1, Total Cost: $2.30
        // Name: Yogurt, Quantity: 3, Total Cost: $4.95
        // Name: Juice, Quantity: 2, Total Cost: $13.98
        // Name: Coffee Filters, Quantity: 2, Total Cost: $3.30
        // Name: Toilet Paper, Quantity: 2, Total Cost: $25.10
        // Name: Chewing Gum, Quantity: 4, Total Cost: $1.80
        // Name: Pencils, Quantity: 2, Total Cost: $3.98
        // Name: Bread, Quantity: 1, Total Cost: $2.34
        // Name: Eggs, Quantity: 1, Total Cost: $3.12
        // Name: Chips, Quantity: 2, Total Cost: $4.40
        // ----------------------
        // TOTAL: $65.27
        // ----------------------
        groceryList.display();
    }
}
