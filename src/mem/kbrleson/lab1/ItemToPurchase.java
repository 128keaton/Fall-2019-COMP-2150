package mem.kbrleson.lab1;

public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    private int itemPrice = 0;
    private int itemQuantity = 0;

    public ItemToPurchase() {
        this.itemDescription = "none";
    }

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        String output = this.itemName;
        output = output + " " + this.itemQuantity;
        output = output + " @ $" + this.itemPrice;
        output = output + " = $" + (this.itemQuantity * this.itemPrice);

        return output;
    }

    public int getTotalCost() {
        return this.itemQuantity * this.itemPrice;
    }

    public void printItemCost() {
        System.out.println(this);
    }

    public void printItemDescription() {
        System.out.println(this.itemName + ": " + this.itemDescription);
    }
}
