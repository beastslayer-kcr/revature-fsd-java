import java.util.Scanner;
public class MenuProb {

	public static void main(String[] args) {
		String[] menu = {"Balance Enquiry", "Recharge", "Change Caller Tune", "Exit"};
		int x;
		do {
			System.out.println("enter number");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			
			if(x == 1) {
				System.out.println("Balance Enquiry");
			}
			else if (x == 2) {
				System.out.println("Recharge");
			}
			else if (x == 3) {
				System.out.println("Change Caller Tune");
			}
			else if (x == 4) {
				System.out.println("Exit");
			} 
			else {
				System.out.println("Wrong Entered");
			}
		} while(x != 4 );

	}

}
