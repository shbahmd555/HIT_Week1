package com.sas.week3;

import java.util.Scanner;
public class ReflectionDemo2 {
	public static void main(String[] args)throws Exception {
		
		//1. static binding.... things which cannot be changed..
		Paint1 staticPaint=new RedPaint1();
		System.out.println("Object created through static way...:"+staticPaint);
		
		//2. dynamic binding.... To dynamically create objects...
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the qualified class name...:");
		String paintClass=scan.next(); //Enter class name with Package name 
		//Where ever the return type of a method is Object, you need to do typecasting
		
		Paint1 dynamicPaint=(Paint1)Class.forName(paintClass).newInstance();
		System.out.println("Object created through dynamic way...:"+dynamicPaint);
		
		//3. new way of creating objects dynamically....after jdk9
		Paint1 s=(Paint1)Class.forName(paintClass).getConstructor().newInstance();
		System.out.println("Object created through new dynamic way...:"+dynamicPaint);
		
	
	}
}
abstract class Paint1{
	
}
class RedPaint1 extends Paint1{
	public RedPaint1() {
		
	}
}
class BluePaint1 extends Paint1{
	public BluePaint1() {
		
	}
}




