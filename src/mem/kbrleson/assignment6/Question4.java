package mem.kbrleson.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class Question4 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> duplicates) {
        ArrayList<E> duplicatesRemoved = new ArrayList<E>();

        for(E listItem : duplicates) {
            if(!duplicatesRemoved.contains(listItem)) {
                duplicatesRemoved.add(listItem);
            }
        }

        return duplicatesRemoved;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numberArray = new ArrayList<>(Arrays.asList(14, 24, 14, 42, 24, 25));
        ArrayList<String> nameArray = new ArrayList<>(Arrays.asList("Sidi", "Jasmine", "Jose", "Tasfia", "Dylan", "Zeric", "Sidi", "Jose", "Jasmine"));

        System.out.println("Original Integer list: " + numberArray);
        System.out.println("No-dup Integer list: " + removeDuplicates(numberArray));

        System.out.println("\nOriginal name list: " + nameArray);
        System.out.println("No-dup name list: " + removeDuplicates(nameArray));
    }
}
