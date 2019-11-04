package mem.kbrleson.assignment6;

public class Question5 {
    public static <E extends Comparable<E>> int search(E[] list, E key) {
        for (int itemIndex = 0; itemIndex < list.length; itemIndex++) {
            if (key.equals(list[itemIndex])) {
                return itemIndex;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{4, 12, 4, 19, -83, 99, -1, -12};
        String[] strings = new String[]{"Asa", "Raven", "Kara", "Jordan", "James", "Canon", "who"};

        System.out.println("Looking for 99, index = " + search(integers, 99));
        System.out.println("Looking for \"who\", index = " + search(strings, "who"));
    }

}
