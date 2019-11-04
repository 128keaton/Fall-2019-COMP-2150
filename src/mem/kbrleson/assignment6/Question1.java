package mem.kbrleson.assignment6;

import java.util.*;

class Kangaroo {
    private int kangarooNum;

    public Kangaroo(int i) {
        kangarooNum = i;
    }

    public void hop() {
        System.out.println("Kangaroo " + kangarooNum + " hops");
    }
}

public class Question1 {
    public static void main(String[] args) {
		ArrayList<Kangaroo> listaroos = new ArrayList<>();
		listaroos.add(new Kangaroo(0));
		listaroos.add(new Kangaroo(1));
		listaroos.add(new Kangaroo(2));
		listaroos.add(new Kangaroo(3));
		listaroos.add(new Kangaroo(4));

        // a
		System.out.println("  +++++++++++ hop in for loop");
        for (int i = 0; i < listaroos.size(); i++) {
            new Kangaroo(i).hop();
        }

        // b
		System.out.println(" ----------- hop in Enhanced loop");
        for(Kangaroo listaroo : listaroos) {
			listaroo.hop();
		}

        // c
		System.out.println(" *********** hop in Iterator style");
		Iterator<Kangaroo> kangarater = listaroos.iterator();

		while (kangarater.hasNext())  {
			kangarater.next().hop();
		}
	}
}

