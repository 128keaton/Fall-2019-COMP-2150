package mem.kbrleson.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart() {
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return this.currentDate;
    }

    public void addItem(ItemToPurchase item) {
        this.cartItems.add(item);
    }

    public void removeItem(String itemName) {
        List<ItemToPurchase> matchingItems = this.cartItems
                .stream()
                .filter(item -> item.getName().equals(itemName))
                .collect(Collectors.toList());

        if (matchingItems.size() > 0) {
            cartItems.removeIf(item -> item.getName().equals(itemName));
            return;
        }

        System.out.println("Item not found in cart. Nothing removed.");
    }

    public void modifyItem(ItemToPurchase itemModified) {
        List<ItemToPurchase> matchingItems = this.cartItems
                .stream()
                .filter(item -> item.getName().equals(itemModified.getName()))
                .collect(Collectors.toList());

        if (matchingItems.size() > 0 && isNotDefault(itemModified)) {
            ItemToPurchase matchingItem = matchingItems.get(0);
            cartItems.replaceAll(item -> {
                if (item.getName().equals(matchingItem.getName())) {
                    if (!itemModified.getDescription().equals("updated") && !item.getDescription().equals(itemModified.getDescription())) {
                        item.setDescription(itemModified.getDescription());
                    }

                    if (itemModified.getQuantity() > 0 && item.getQuantity() != itemModified.getQuantity()) {
                        item.setQuantity(itemModified.getQuantity());
                    }

                    if (itemModified.getPrice() > 0 && item.getPrice() != itemModified.getPrice()) {
                        item.setPrice(itemModified.getPrice());
                    }
                }
                return item;
            });
            return;
        }

        System.out.println("Item not found in cart. Nothing modified.");
    }

    public int getNumItemsInCart() {
        return this.cartItems.stream()
                .map(ItemToPurchase::getQuantity)
                .reduce(0, Integer::sum);

    }

    public int getCostOfCart() {
        return this.cartItems.stream()
                .map(ItemToPurchase::getTotalCost)
                .reduce(0, Integer::sum);
    }

    public void printTotal() {
        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        System.out.println("Number of Items: " + this.getNumItemsInCart());

        System.out.println();
        if (this.cartItems.size() > 0) {
            this.cartItems.stream()
                    .map(ItemToPurchase::toString)
                    .forEach(System.out::println);

            System.out.println();
            System.out.println("Total: $" + this.getCostOfCart());
            return;
        }

        System.out.println("SHOPPING CART IS EMPTY");
    }

    public void printDescriptions() {
        System.out.println(this.customerName + "'s Shopping Cart - " + this.currentDate);
        System.out.println();
        if (this.cartItems.size() > 0) {
            this.cartItems.stream()
                    .map(item -> item.getName() + ": " + item.getDescription())
                    .forEach(System.out::println);
            return;
        }

        System.out.println("SHOPPING CART IS EMPTY");
    }

    private boolean isNotDefault(ItemToPurchase itemToCheck) {
        return itemToCheck.getName() != null && !itemToCheck.getDescription().equals("none")
                && itemToCheck.getTotalCost() != 0 && itemToCheck.getQuantity() != 0;
    }
}
