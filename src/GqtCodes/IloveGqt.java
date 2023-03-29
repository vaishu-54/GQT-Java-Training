package GqtCodes;
import java.util.Scanner;
public class IloveGqt {

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
			System.out.print("          ");
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
			
			//T
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
			System.out.println();
		}


	}

}
