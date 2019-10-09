// This program demonstrate the construction starts from the base towards to next derived class
// even if you don't provide the coloring constructor(), the compiler will make one for you.

package mem.kbrleson.lecture3.supplemental;

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

class Coloring extends Drawing {
    Coloring() {
        System.out.println("Coloring constructor");
    }
}

public class Cartoon extends Coloring {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
} 
