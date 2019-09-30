// kbrleson
// Assignment 3 - Question 1
// COMP-2150
// September 30th, 2019

package mem.kbrleson.assignment3;

class Test {
	int a;
	int b;

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void calc(int a, int b) {
		this.a = a * 2;
		this.b =  b / 2;
	}
}

public class Question1 {
	public static void main (String[] args)  {
		int a = 15;
		int b = 20;

		Test obj = new Test(a, b);

		System.out.println ("Before calc obj.a is " + obj.a + " and obj.b is "  + obj.b);
		obj.calc(a, b);
		System.out.println ("After calc obj.a is " + obj.a + " and obj.b is "  + obj.b);
	} 
}
