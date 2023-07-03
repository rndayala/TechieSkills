package com.rndayala.corejava.boxedprimitives;

/**
 * @author rndayala
 * 
 * For Boxed primitives created using new operator, the identity operation 
 * doesn't compare content(values). It compares the references.
 * However, the boxed primitives created using valueOf() method, identity operation compares the content.
 * 
 * For operators: <, <=, >, >= --> auto un-boxing happens and compares the values.
 *
 */
public class BoxedPrimitivesIdentityOperation {

	public static void main(String[] args) {
		Integer num1 = new Integer(0);
		Integer num2 = new Integer(0);
		Integer num3 = new Integer(1);
		
		System.out.println("(num1 == num2) : " + (num1 == num2));  // (num1 == num2) : false
		System.out.println("(num1.equals(num2) : " + num1.equals(num2));  // (num1.equals(num2) : true
		
		System.out.println("(num1 < num3) : " + (num1 < num3)); // true; auto un-boxing happens with operators : <, <=, >, >=
		
		// valueOf() method is preferred over new Integer() 
		Integer num4 = Integer.valueOf(0);
		Integer num5 = Integer.valueOf(0);
		
		System.out.println("(num4 == num5) : " + (num4 == num5));  // (num4 == num5) : true
		System.out.println("(num4.equals(num5) :" + (num4.equals(num5))); // (num4.equals(num5) :true
		
	}

}
