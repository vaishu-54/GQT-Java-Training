package GqtCodes;
import java.util.Scanner;
public class GqtPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			//G
			for(int j=0;j<=n-1;j++) {
				if(  (j==0 && i!=0 && i!=(n-1))
				  || (i==0 && j!=0 && j<=n/2)
				  || (i==(n-1) && j<n/2  && j!=0 && j!=n/2)
				  || (i==n/2 && j>n/4 && j<=n/2)
				  || (j==n/2 && i>=n/2 && i!=(n-1))
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//Q
			for(int j=0;j<=n-1;j++) {
				if(  (j==0 && i!=0 && i!=(3*n)/4 && i<(3*n)/4)
				  || (j==n/2 && i!=0 && i!=(3*n)/4 && i<(3*n)/4)
				  || (i==0 && j!=0 && j!=n/2 && j<n/2)
				  || (i==(3*n)/4 && j!=0 && j!=n/2 && j<n/2)
				  || i-j==n/2
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//I
			for(int j=0;j<=n-1;j++) {
				if(  (i==0 && j<n/2)
				  || (j==n/4 )	
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
			System.out.println();
		}

	}

}
