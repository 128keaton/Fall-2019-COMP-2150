package mem.kbrleson.lab1;

import java.util.Scanner;

public class ShoppingCartManager {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String customerName, currentDate;

        System.out.println("Enter Customer's Name:");
        customerName = scnr.nextLine();

        System.out.println("Enter Today's Date:");
        currentDate = scnr.nextLine();

        System.out.println();
        System.out.println("Customer Name: " + customerName);
        System.out.println("Today's Date: " + currentDate);

        ShoppingCart shoppingCart = new ShoppingCart(customerName, currentDate);

        System.out.println();
        printMenu(shoppingCart);
    }

    public static void printMenu(ShoppingCart currentCart) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("Choose an option:");

        String optionChosen = scnr.nextLine();

        switch (optionChosen) {
            case "q":
                break;
            case "a":
                System.out.println("ADD ITEM TO CART");
                addItemToCart(currentCart);
                printMenu(currentCart);
                break;
            case "d":
                System.out.println("REMOVE ITEM FROM CART");
                removeItemFromCart(currentCart);
                printMenu(currentCart);
                break;
            case "c":
                System.out.println("CHANGE ITEM QUANTITY");
                modifyItemQuantityInCart(currentCart);
                printMenu(currentCart);
                break;
            case "i":
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                currentCart.printDescriptions();
                printMenu(currentCart);
                break;
            case "o":
                System.out.println("OUTPUT SHOPPING CART");
                currentCart.printTotal();
                printMenu(currentCart);
                break;
            default:
                printMenu(currentCart);
                break;
        }
    }

    public static void addItemToCart(ShoppingCart currentCart) {
        Scanner scnr = new Scanner(System.in);
        String itemName, itemDescription;
        int itemPrice, itemQuantity;

        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();

        System.out.println("Enter the item description:");
        itemDescription = scnr.nextLine();

        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();

        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();

        ItemToPurchase newItem = new ItemToPurchase(itemName, itemDescription, itemPrice, itemQuantity);
        currentCart.addItem(newItem);
    }

    public static void removeItemFromCart(ShoppingCart currentCart) {
        Scanner scnr = new Scanner(System.in);
        String itemName;

        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();

        currentCart.removeItem(itemName);
    }

    public static void modifyItemQuantityInCart(ShoppingCart currentCart) {
        Scanner scnr = new Scanner(System.in);
        String itemName;
        int newQuantity;

        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();

        System.out.println("Enter the new quantity:");
        newQuantity = scnr.nextInt();

        ItemToPurchase modifiedItem = new ItemToPurchase(itemName, "updated", -1, newQuantity);

        currentCart.modifyItem(modifiedItem);
    }
}
