// A simple program C to show conditional operator
//   x ? 1 : -1; x is 1 if true otherwise -1
//   try it and ee

// stm() is a static method...so.. what is so special about it?

public class C {
 private boolean x;
 public static void main (String[] args) {
	 C c = new C();
	 System.out.println(c.x);
	 System.out.println(c.convert() );
 }
 private int convert() {
	 return x ? 1 : -1 ;
 }
}
