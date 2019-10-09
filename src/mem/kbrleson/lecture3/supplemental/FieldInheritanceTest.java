package mem.kbrleson.lecture3.supplemental;

public class FieldInheritanceTest {
    public static void main(String[] args) {
        Field f = new Field("Emma", "Liam");
        System.out.println(f);

        FieldSub g = new FieldSub("Starbuck", "Medium Roast");
        System.out.println(g);
        g.test();
        System.out.println(g);
    }
}
