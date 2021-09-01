import java.util.Scanner;

public class ProfitCalculatorScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bying Price");
		int buyingPrice = scanner.nextInt();
		System.out.println("Enter Selling Price");
		int sellingPrice = scanner.nextInt();
		
		scanner.close();
		int profit = sellingPrice - buyingPrice;
		
		System.out.println("profit = " + profit);

	}

}
