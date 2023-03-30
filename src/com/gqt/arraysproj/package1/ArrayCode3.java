package com.gqt.arraysproj.package1;
import java.util.Scanner;

/*
 * (i)     (j)     (k)
 * School  class  student
 *   0       0      5
 *           1      5
 *   1       0      5
 *           1      5
 *   2       0      5
 *           1      5
 */
public class ArrayCode3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of School:");
		int sch = sc.nextInt();
		System.out.println("Enter the count of Class:");
		int cls = sc.nextInt();
		System.out.println("Enter the count of Students:");
		int stu = sc.nextInt();
		int arr[][][] = new int [sch][cls][stu]; //three dimensional array
		
		//Storing the data
		for(int i=0;i<sch;i++) {
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside Class:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("Enter the marks of Student:"+(k+1));
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//fetching the data
		for(int i=0;i<sch;i++) {
			System.out.println("Inside School:"+(i+1));
			for(int j=0;j<cls;j++) {
				System.out.println("Inside Class:"+(j+1));
				for(int k=0;k<stu;k++) {
					System.out.println("The marks of student no. "+(k+1)+"is = "+arr[i][j][k]);
				}
			}
		}
	}

}
