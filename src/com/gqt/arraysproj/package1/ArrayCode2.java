package com.gqt.arraysproj.package1;
import java.util.Scanner;
public class ArrayCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of class:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of Student:");
		int stu = sc.nextInt();
		int arr[][] = new int[cls][stu]; //two dimensional array
		
		//Storing the data
		for(int i=0;i<cls;i++) {
			System.out.println("Inside Class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter marks of students:"+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		
		//fetching the data
		for(int i=0;i<cls;i++) {
			System.out.println("Inside Class:"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("The marks of student no.:"+(j+1)+"is = "+arr[i][j]);
			}
		}

	}

}
