package com.kodnest.Array1;
import java.util.*;
public class array2d {
	
	 public static void main(String[]args) {
		 Scanner scan= new  Scanner(System.in);
		 
		 System.out.println("enter the no of employee");
		 int row=scan.nextInt();
		 
		  System.out.println("enter the no of employee");
		 int col=scan.nextInt();
		 
		 String[][]arr=new String[row][col];
		 
		 for(int i=0;i<=arr.length-1;i++) {
			 
			 for(int j=0;j<=arr.length-1;j++) {
				 System.out.println("enter the name of company"+(i+1)+"employe"+(j+1));
				 arr[i][j]=scan.next();
				 
			 }
		 }
		 
		 
		 
		 
		 
		 for(int i=0;i<=arr.length-1;i++) {
			 
			 for(int j=0;j<=arr.length-1;j++) {
				 System.out.println("enter the name of company"+(i+1)+"employe"+(j+1));	 
		 
		 
			 }
		 }
	 }

}
