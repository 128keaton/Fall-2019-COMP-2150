package mem.kbrleson.lecture3.supplemental;

public class TestD11 extends TestOverrideDerived {
	private int x;
	private int y;
	public TestD11() {
		System.out.println(" no-Arg Constructor in TestD11 ");
	}
	@Override
	public void func() {
 	 	super.func();
		System.out.println(" func in D11");
	}

	@Override
	public void func(int x) {
	 	super.func(x);
		System.out.println("in func(x) " + x);
		this.x = x;
	}
	
	public void funD11(int y) {
	this.y = y;
	}
}
