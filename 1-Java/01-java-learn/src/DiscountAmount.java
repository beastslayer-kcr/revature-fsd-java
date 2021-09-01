import java.util.Scanner;
public class DiscountAmount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Bill Amount");
		int billAmount = in.nextInt();
		
		System.out.println("Enter Bill Amount");
		float discountPercentage = in.nextFloat();
		in.close();
		float discount = billAmount * discountPercentage/100.0f;
		System.out.println("Discounted Amount = " + discount);
	}

}
