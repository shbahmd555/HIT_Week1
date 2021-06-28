package com.sas.week1;

public class AssoDemo2 {
	public void eatLaddu(Laddu1 l) {
		System.out.println("laddu is eaten now....half");
		l.setSize(7);
	}
	public static void main(String[] args) {
		Laddu1 laddu=new Laddu1();//association - assodemo has knowledge of laddu
		laddu.setSize(15);
		System.out.println("Before eating laddu the size is...:"+laddu.size);
		
		AssoDemo2 obj1=new AssoDemo2();
		//passing the object by reference...
		obj1.eatLaddu(laddu);
		
		System.out.println("After eating laddu the size is...:"+laddu.size);
	}
}
class Laddu1 {
	int size;
	public void setSize(int size) {//local variables takes precedance over the global variables
		this.size=size;
	}
}