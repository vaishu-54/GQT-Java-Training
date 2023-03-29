package GqtCodes;
import java.util.Scanner;
public class VaishnaviPatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++){
			//V
			for(int j=0;j<=n-1;j++) {
				if( (i==j && i<=n/2 && j<=n/2)
				  ||(i+j==(n-1) && i<=n/2 && j>=n/2)
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			
			//A
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n/2 
					|| (i==0 && j<=n/2)
					|| (i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//I
			for(int j=0;j<=n-1;j++) {
				if(j==n/4  || (i==0 && j<n/2) || (i==(n-1) && j<n/2)
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}	
			}
			
			//S
			for(int j=0;j<=n-1;j++) {
				if(  (i==0 && j<n/2 && j!=0)
				  || (i==n/2 && j<n/2 && j!=0 && j!=n/2)
				  || (i==(n-1) && j<n/2 && j!=n/2)
				  || (j==0 && i<n/2 && i!=0)
				  || (j==n/2 && i>n/2 && i!=(n-1))
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//H
			for(int j=0;j<=n-1;j++) {
				if(  j==0 || j==n/2 || (i==n/2  && j<=n/2)
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//N
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==(n-1) || i==j) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("    ");
			//A
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==n/2 
					|| (i==0 && j<=n/2)
					|| (i==n/2 && j<=n/2)) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//V
			for(int j=0;j<=n-1;j++) {
				if( (i==j && i<=n/2 && j<=n/2)
				  ||(i+j==(n-1) && i<=n/2 && j>=n/2)
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("   ");
			//I
			for(int j=0;j<=n-1;j++) {
				if(j==n/4  || (i==0 && j<n/2) || (i==(n-1) && j<n/2)
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}


	}

}
