
// Static method can be inherited and overwritten

public class TestStaticMethodInherite {

	public static void main(String[] args) {
		Ax a1 = new Ax();
		Bx b1 = new Bx();
		Ax.m1();
		Bx.m1();

	}

}

class Ax {
	static int i = 0;
	static void m1() {
		System.out.println(" static Ax.m1()");
	}
}
class Bx extends Ax{
	static void m1() {
		System.out.println(" static Bx.m1() ");
	}
}
