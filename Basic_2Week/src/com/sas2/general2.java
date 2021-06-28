package com.sas2;

public class general2
{
		public static void main(String argv[]){
		int anar[]=new int[]{1,2,3};
		System.out.println(anar[1]);
		int anar1[]=new int[5];
		System.out.println(anar1[0]);
		
		System.out.println("//******************************//");
		
		int i=1;
		switch (i) {
		case 0:
		System.out.println("zero");
		break;
		case 1:
		System.out.println("one");
		case 2:
		System.out.println("two");
		default:
		System.out.println("default");
		
		System.out.println("//******************************//");
		}
		int j=9;
		switch (j) {
		default:
			System.out.println("default");
			case 0:
			System.out.println("zero");
			break;
			case 1:
			System.out.println("one");
			case 2:
			System.out.println("two");
			}
		
		}
}
