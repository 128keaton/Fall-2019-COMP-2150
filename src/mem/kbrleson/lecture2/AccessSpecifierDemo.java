/*

*/
class A {
   public int x = 5; // public modifier
   private int y = 7; // private modifier
   protected int z = 3; // protected modifier
 
   public int getY() { /* access the value of private variable using a public method */
      return y;
   }
   
   public static void mx() {  //  created a static method 
	   System.out.println(" static method mx() of class A");
   }
}
/* class B inherits from A */
class B extends A {
   int w = 13; // default modifier
   public void modifyVar() {
      x++;
      // y++; // compilation error ( y is not accessible )
      z++;
      
   }
   public void printVar() {
         System.out.println("x = " + x + " z = " + z + " w = " + w);
   }
}

public class AccessSpecifierDemo {
   public static void main(String args[]) {
      A obj1 = new A();
      /*
       * Testing extends and casting
       *        * 
       */
     /* 
      A h1 = new A();
      A h2 = new B();
      
      B b1 = h1;  // cannot convert h1 to b1
      B b2 = (B) h1; // its ok...
      B b3 = (B) h2; // its OK
      B b4 = (B) new A();
      A h = h1;
      */
     
      int val_x = obj1.x;  // access public field
      //int val_y = obj.y;  // y is private --- compile error ( object cannot access it )
      int val_y = obj1.getY();
       // int val_z = obj1.z(); // z is protected compile error ( object can't access it )
      System.out.println("x = " + val_x + " y = " + val_y);

      A.mx();
      my();
      
      B obj2 = new B(); // create an object of class B
      obj2.modifyVar();
      obj2.printVar();
   }
   public static void my() {
	   System.out.println(" static class my() of AccessSpecifierDemo");
	   
   }
   
}