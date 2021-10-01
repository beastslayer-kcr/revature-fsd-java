import java.util.Scanner;

public class ZeroDiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][n];
		for(int r=0;r<n;r++) {
			for(int c=0;c<n;c++) {
				if(c==n/2 || r==n/2) {
					System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
				
			}
			System.out.println();
		}
		
	}

}
