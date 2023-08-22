package com.darshan.array.oneDArray;

import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int arr[] = new int[scan.nextInt()];
		for(int i =0;i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
