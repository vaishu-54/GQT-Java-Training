package GqtCodes;
import java.util.Scanner;
public class IloveIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i=0;i<=n-1;i++) {
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
			//Heart shape
			for(int j=0;j<=n-1;j++) {
				if(  (j==0 && i!=0 && i<n/2 && i!=n/2)
				  || (j==(n-1) && i!=0 && i<n/2 && i!=n/2)
				  || (i==j && i<=n/2 && j<=n/2 && i!=0)
				  || (i+j==(n-1) && i<=n/2 && j>=n/2 && i!=0)
				  || (i-j==n/2 )
				  || (i+j==(n/2)+(n-1))
						) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("        ");
			
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
			
			//N
			for(int j=0;j<=n-1;j++) {
				if(j==0 || j==(n-1) || i==j) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("        ");
			
			
			//D
			for(int j=0;j<=n-1;j++) {
				if(  j==0
				 || (i==0 && j<n/2)
				 || (i==(n-1) && j<n/2)
				 || (j==n/2 && i!=0 && i!=(n-1))
						) {
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
			
			System.out.println();
		}


	}

}
