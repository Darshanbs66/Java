package com.darshan.array.oneDArray;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[]arg) {
		int [] arr= new int[5];
		Scanner scan= new Scanner(System.in);
		System.out.println("ennter number");
		
		for (int i=0; i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
	
	for (int i : arr) {
		
		System.out.print(i+" ");
	}
	System.out.println("enter a  value to search");
	
	int key=scan.nextInt();
	 for(int i=0;i<=arr.length-1;i++) {
		 if(arr[i]==key) {
			 System.out.println("key is present");
			 return;
		 }
	 }
	 System.out.println("key not found");
	
	}

}
