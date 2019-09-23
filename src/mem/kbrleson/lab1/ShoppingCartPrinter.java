package mem.kbrleson.lab1;
// kbrleson

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase firstItem = new ItemToPurchase();
        ItemToPurchase secondItem = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        firstItem.setName(scnr.nextLine());

        System.out.println("Enter the item price:");
        firstItem.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");
        firstItem.setQuantity(scnr.nextInt());

        scnr.nextLine();
        System.out.println();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        secondItem.setName(scnr.nextLine());

        System.out.println("Enter the item price:");
        secondItem.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");
        secondItem.setQuantity(scnr.nextInt());

        printTotalCosts(firstItem, secondItem);
    }

    public static void printTotalCosts(ItemToPurchase firstItem, ItemToPurchase secondItem) {
        System.out.println("TOTAL COST");
        System.out.println();
        System.out.println(firstItem);
        System.out.println(secondItem);

        System.out.println();
        System.out.println("Total: $" + (firstItem.getTotalCost() + secondItem.getTotalCost()));
    }
}
