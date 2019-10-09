package com.Constructors;

class Base 
{ 
    String name; 
  
    // constructor 1 
    Base() 
    { 
        this(""); 
        System.out.println("No-argument constructor of" +  
                                           " base class"); 
    } 
  
    // constructor 2 
    Base(String name) 
    { 
        this.name = name; 
        System.out.println("Calling parameterized constructor" 
                                              + " of base"); 
    } 
} 
public class Chain2AnotherClass_Super extends Base {
	 // constructor 3 
	Chain2AnotherClass_Super() 
    { 
        System.out.println("No-argument constructor " +  
                           "of derived"); 
    } 
  
    // parameterized constructor 4 
	Chain2AnotherClass_Super(String name) 
    { 
        // invokes base class constructor 2 
        super(name); 
        System.out.println("Calling parameterized " +  
                           "constructor of derived"); 
    } 
  
    public static void main(String args[]) 
    { 
        // calls parameterized constructor 4 
    	Chain2AnotherClass_Super obj = new Chain2AnotherClass_Super("test"); 
  
        // Calls No-argument constructor 
    	Chain2AnotherClass_Super obj1 = new Chain2AnotherClass_Super(); 
    } 
}
