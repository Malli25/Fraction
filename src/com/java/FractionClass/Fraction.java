package com.java.FractionClass;

import java.util.Scanner;

/*  Implement (in either C++ or Java) a Fraction class that supports the following 
 * operations: addition, subtraction, multiplication, division, 
 * equality/non-equality, greater than/less than, and display.
 */

public class Fraction {
	
	// Variables of Fraction a numerator and denominator
	private int numerator;
	private int denominator;
	
	// Default Constructor
	public Fraction(){
		numerator = 0;
		denominator = 1; // 
		}
	
	// Constructor with parameters
	public Fraction(int num, int deno) {
	     numerator = num;
		 if(deno==0 ){
			 // Checking if denominator is Zero.
			 // If Zero print an Error and Ask user to enter a valid number or
			 // Could have try catch block to throw an IllegalArgumentException
			System.err.println("Divide by Zero is Illegal");
		    System.out.println("Enter a valid number");
		    Scanner s = new Scanner(System.in);
		    this.setDenominator(s.nextInt()); 
		    s.close();
		 }
		 else
			denominator = deno;
		 
		 //Handling negative numbers Making numerator negative.
		 if(deno <0){
			 numerator = -num;
			 denominator = -deno;
		 }
	}
	
	// Getter Setter Methods
	//return numerator
	public int getNumerator() {
		return numerator;
	}
	//set numerator
   public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
    // return denominator
  public int getDenominator() {
		return denominator;
	}
    //set denominator
  public void setDenominator(int denomenator) {
		this.denominator = denomenator;
	}

  


	@Override
	public String toString(){
		return numerator + "/" + denominator;
	}
	
	// Multiplication method
   public Fraction multiply(Fraction f){
	   
	   Fraction mulresult = new Fraction(numerator * f.numerator, denominator * f.denominator);
	   mulresult.reduceFraction();
	   return mulresult; 
   }

// Division method
   public Fraction division(Fraction f){
	   
	   Fraction divresult = new Fraction(numerator * f.denominator, denominator * f.numerator);
	   divresult.reduceFraction();
	   return divresult; 
   }
   
  // Addition Method
  public Fraction addition(Fraction f){
	  
	  Fraction addresult = new Fraction();
	  addresult.denominator = denominator * f.denominator;
	  addresult.numerator = numerator * f.denominator + denominator * f.numerator;
	  
	  addresult.reduceFraction();		  
	 		  
    return addresult;
  }
  
  //Subtract Method
  
public Fraction subtract(Fraction f){
	  
	  Fraction subresult = new Fraction();
	  subresult.denominator = denominator * f.denominator;
	  subresult.numerator = numerator * f.denominator - denominator * f.numerator;
	  
	  subresult.reduceFraction();		  
	 		  
    return subresult;
  }
  
  
  // Equal or notEqual
  
   public String areEqual(Fraction f){
	   
	   
	    this.reduceFraction();
	    f.reduceFraction();
	     if(this.numerator!= f.numerator || this.denominator!=f.denominator)
	    	 return "UnEqual";
	     else
	    	 return "Equal";
	   
   }
 public String isGreater(Fraction f){
	 
	 String areEqual = this.areEqual(f);
	 if(areEqual=="UnEqual"){
		double f1value = (numerator / denominator)*1.0;
		double f2value = (f.numerator / f.denominator)*1.0;
	    return f1value > f2value ? "true":"false";
	    
	 }
	 return "false";
}


 // Reducing the factor to their lowest 
  public void reduceFraction(){
	  if(this.denominator ==0)
		  return ;
	 
	  // Euclid Algorithm for GCD
	  int dividend = 0;
	  int divisor = 0;
	  if(this.numerator != this.denominator ){
	  dividend = Math.max(this.numerator, this.denominator);
	  divisor = Math.min(this.numerator, this.denominator);
	  }
	  else {
		  dividend = this.numerator;
		  divisor = this.denominator;
	  }
		 
	  while(divisor!=0){
		  int r = dividend % divisor;
		  dividend = divisor;
		  divisor = r;
		  }
	  
	  // Here dividend is the GCD obtained from the above while loop
	 this.numerator /= dividend;
	 this.denominator/=dividend;  
  }
  
  
  public String getMethodName(final int depth)
  {
    final StackTraceElement[] strace = Thread.currentThread().getStackTrace();
    return strace[strace.length - 1 - depth].getMethodName();
  }
  
 
	public void Display(){
		if(denominator == 1)
			System.out.println(this.numerator);
		else
		System.out.println( this.numerator + "/" + this.denominator);
	}
   
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Fraction f1 = new Fraction(2, 6);
		Fraction f2 = new Fraction(1, 5);
	
		System.out.println("Division of fractions" + f1.Display() + "and" + f2.Display());
	    Fraction result = f1.division(f2);
		result.Display();
	
		
	}

}
