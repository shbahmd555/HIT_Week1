package com.sas.week1;

public class InherDemo2 {
		public static void main(String[] args) {
			Employee1 p=new Engineer1();
			Engineer1 eng=new Engineer1();
			
			p.met(2);
			eng.met(2);
		}
	}
	class Human{
		public void blabla() {
			System.out.println("bla bla method called....");
		}
	}
	class Employee1 extends Human{	
		public int met(int i) {
			System.out.println("met method of employee called...");
			return i;
		}
	}
	//rules of method overriding
	//1. the parameters, method name and return type shoud be same to same
	//2. the accept2 specifier cannot be reduced - visibility cannot be reduced but can be increased.
	//inheritance or generalization
	class Engineer1 extends Employee1{//child is a kind of parent,... child can replace parent
		public int met(int i) {//method overriding..
			System.out.println("engineer met method called....");
			super.met(4);//super is a key word which refers the parent class...
			super.blabla();
			return i;
		}
	}
	class Attender1 extends Employee1{
		
	}






	