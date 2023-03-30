package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the count of Students:");
			int n = sc.nextInt();
			int arr[] = new int[n]; //one dimensional array
			
			//storing the data
			for(int i=0;i<=n-1;i++) {
				System.out.println("Enter the marks of Students:"+(i+1));
				arr[i] = sc.nextInt();
			}
			System.out.println("********* ----------- Marks added ------------- ***************");
			
			//fetching data
			for(int i=0;i<=n-1;i++) {
				System.out.println("The marks of student:"+(i+1)+"is = "+arr[i]);
			}
		

	}

}
