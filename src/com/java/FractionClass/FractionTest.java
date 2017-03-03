package com.java.FractionClass;

import junit.framework.TestCase;
import org.junit.*;

public class FractionTest extends TestCase{

	
	@Test 
	public void testReduced(){
		Fraction f1 = new Fraction(20,50);
		f1.reduceFraction();
		
		assertEquals(2, f1.getNumerator());
		assertEquals(5, f1.getDenominator());
	}
	
	@Test
	public void testAreEqual(){
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(1, 3);
		
		
       	f1.reduceFraction();
       	f2.reduceFraction();
       	
       	String s = f1.areEqual(f2);
       	assertEquals("Equal",s);
    	
	}
	
	@Test
	public void testAdditionFractions(){
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(1, 3);
	
	    Fraction result = f1.addition(f2);
	    
	    assertEquals(2, result.getNumerator());
		assertEquals(3, result.getDenominator());
	
}
	
	
	@Test
	public void testSubtractFraction(){
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(1, 5);
	
	    Fraction result = f1.subtract(f2);
	    
	    assertEquals(2, result.getNumerator());
		assertEquals(15, result.getDenominator());
	
}
	
	@Test
	public void testDivisionFraction(){
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(1, 5);
	
	    Fraction result = f1.division(f2);
	    
	    assertEquals(5, result.getNumerator());
		assertEquals(3, result.getDenominator());
	
}
	
	
	@Test
	public void testMultiplyFraction(){
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(7, 3);
	
	    Fraction result = f1.multiply(f2);
	    
	    assertEquals(7, result.getNumerator());
		assertEquals(9, result.getDenominator());
	
}
	
	
	
	
	
	
	
	
	
	
}
	
