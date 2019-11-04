package mem.kbrleson.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{0, 1, 2, 3, 4};
        String[] array2 = new String[]{"Stephen", "Arielle",  "Rabie",  "Tyler", "Sahil"};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<String> list2 = new ArrayList<>(Arrays.asList(array2));

        System.out.println("list1: "+ list1);
        System.out.println("list2: " + list2);

        System.out.println("list1 forward order");
        for(Integer integer : list1) {
            System.out.print(integer + " ");
        }

        Collections.reverse(list1);

        System.out.println("\nlist1 reverse order");
        for(Integer integer : list1) {
            System.out.print(integer + " ");
        }

        System.out.println("\nlist2 forward order");
        for(String string : list2) {
            System.out.print(string + " ");
        }

        Collections.reverse(list2);

        System.out.println("\nlist2 reverse order");
        for(String string : list2) {
            System.out.print(string + " ");
        }

        System.out.println("\nDisplay the original lists");
        Collections.reverse(list1);
        Collections.reverse(list2);
        System.out.println("list1: "+ list1);
        System.out.println("list2: " + list2);
    }
}
