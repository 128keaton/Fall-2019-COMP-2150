package mem.kbrleson.lecture3.supplemental;

public class TestOverrideInheritDemo {

    public static void main(String[] args) {

        int t = 0;

        TestOverrideDerived d1 = new TestOverrideDerived();
        TestOverrideDerived d2 = new TestOverrideDerived();
        TestOverrideBase b1 = new TestOverrideBase();
        TestOverrideBase b2 = new TestOverrideDerived(); // this ONE is not a direct base Class
        TestD11 d111 = new TestD11();

        b1.func(9);
        t = b1.getB();
        System.out.println("t = " + t);

        // exercise: uncomment each of the following lines and explain.
//		d111.func();
//		d1.func(100);
//      d1.func2(); // in base func2 method... Override? in Derived Class func
//      d1.func3();//
//		d1.funcD2(); // FunD2() is derived also executed func3
//      d1.func();// Override? In Derived Class func method
//      b2.func();// Override? In Derived Class func method
//      b2.func2();// in base func2 method ... override? in Derived class func
//      b2.func3();// in base func3 method
//		b2.funcD2();  // cannot call derived class methods...! Why NOT

    }

}
