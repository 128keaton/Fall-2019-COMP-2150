package mem.kbrleson.lecture3.supplemental;

public class TestOverrideBase {
    // change the func() to private and back to public to see the effect of
    // not able to override the private... Also check the @Override chk
    // in TestOverrideDerive Class

    // private void func(){
    private int b;

    public void func() {
        System.out.println("In base func method");
        b = 0;
    }

    ;

    public void func(int x) {
        b = x;
        System.out.println(" func( int x) in the base class");
    }

    public int getB() {
        return b;
    }


    public void func2() {
        System.out.println("in base func2 method");
        func(); // this is overrided abd execute in derive class
    }

    public void func3() {
        System.out.println(" in base func3 method");

    }

}
