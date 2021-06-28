package com.sas.week1a;
import com.sun.jdi.LocalVariable;

	public class PBRArrayDemo2 {
		
		//arrays are object type and the belive in Pass by reference.
			public static void main(String[] args) {
				int arr[]=new int[5];
				for(int i:arr) {
					System.out.print(i+"\t");
				}
				System.out.println();
				AcceptArray obj=new AcceptArray();
				obj.modifyArray(arr);
				System.out.println("After Modification...");
				for(int i:arr) {
					System.out.print(i+"\t");
				}
				System.out.println();
				
			}
		}
		class AcceptArray{
			public void modifyArray(int a[]) {
				a[2]=300;
			}
		}