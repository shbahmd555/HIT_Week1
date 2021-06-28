package com.sas2;

public class general1 
{
	/* wrongly defined variables
	 * 1) float f=1.3; 2) char c="a"; 3) byte b=257; 4) boolean b=null; 5) int i=10;
	 */
 float f= 1.3f ; 
 char c= 'a' ;
 byte b1 = 56;
 boolean b= false ;
  int i=10;
	  public static void main(String arguments[]) {
	  amethod(arguments);
	  }
	  public static void amethod(String[] arguments) {
	  System.out.println(arguments);
	 //System.out.println(arguments[1]); if this line is not commented , we are getting error
	  }
	  
  
  
}
