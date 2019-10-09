package com.Constructors;
// Constructor chaining can be done in any order 
public class ChainingAnyOrder {
	// default constructor 1 
	ChainingAnyOrder() 
    { 
        System.out.println("default"); 
    } 
  
    // parameterized constructor 2 
	ChainingAnyOrder(int x) 
    { 
        // invokes default constructor 
        this(); 
        System.out.println(x); 
    } 
  
    // parameterized constructor 3 
	ChainingAnyOrder(int x, int y) 
    { 
        // invokes parameterized constructor 2 
        this(5); 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        // invokes parameterized constructor 3 
        new ChainingAnyOrder(8, 10); // object with no name... (anonymous object) 
    } 
}
