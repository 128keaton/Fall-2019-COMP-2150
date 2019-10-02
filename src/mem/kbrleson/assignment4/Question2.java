package mem.kbrleson.assignment4;

interface A1 {
    void m1();
    void m2();
}

interface B1 extends A1 {
    void m3();
}

class TheClass implements B1 {
    @Override
    public void m1() {
        System.out.println("Implement m1()");
    }

    @Override
    public void m2() {
        System.out.println("Implement m2()");
    }

    @Override
    public void m3() {
        System.out.println("Implement m3()");
    }
}

class InterfaceDemo {
    static void runDemo() {
        TheClass C1 = new TheClass();

        C1.m1();
        C1.m2();
        C1.m3();
    }
}

public class Question2 {
    public static void main(String[] args) {
        InterfaceDemo.runDemo();
    }
}
