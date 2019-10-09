package mem.kbrleson.lecture3.supplemental;

public class TestOverrideDerived extends TestOverrideBase {

    private int k = 0;

    @Override

    public void func() {   //  check the base func() to private and see what happeb
        System.out.println("Override func() In the base Class func() method");
    }

    public void funcD() {
        System.out.println(" funcD() in derived only");
    }

    public void funcD2() { // funD2() also call its parent to do func3()
        System.out.println(" funcD2 in derived only");
        super.func3();  // execute a function in base
    }

    public void func(int x) {
        k = x;
        System.out.println(" func (int x) Override func( int x) in the based class with x = " + k);
    }

}

