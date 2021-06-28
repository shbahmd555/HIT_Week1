package com.sas.week1;

public class InherDemo {
	
		public static void main(String[] args) {
			Employee p=new Attender(); // Upcasting- subclass casted to super class
			Engineer eng=new Engineer();
		}
	}
	class Employee{
		
		
	}
	//inheritance or generalization
	class Engineer extends Employee{//child is a kind of parent,... child can replace parent
		
	}
	class Attender extends Employee{
		
	}





	
