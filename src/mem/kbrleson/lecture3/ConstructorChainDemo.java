// demo the parent class and child class/object relationship.

package mem.kbrleson.lecture3;

class Batman {
    String s1, s2;

    public Batman() {
        s1 = "Super class - Batman";
        s2 = "Parent class - Batman";
    }

    public Batman(String str) {
        s1 = str;
        s2 = str;
    }

    public void disp() {
        System.out.println("String 1 is: " + s1);
        System.out.println("String 2 is: " + s2);
    }
}

class Robin extends Batman {
    String s2;

    public Robin() {
        s2 = "Child class - Robin"; // s2 in super class
    }

    @Override
    public void disp() {
        System.out.println("String 1 is: " + s1); // get it from the Super class
        System.out.println("String 2 is: " + s2);
    }
}

class ConstructorChainDemo {
    public static void main(String args[]) {
        Batman obj0 = new Batman();
        obj0.disp();
        Robin obj = new Robin();
        obj.disp();
        Batman obj1 = new Robin();
        obj1.disp();
    }
}
