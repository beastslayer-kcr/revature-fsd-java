import java.util.Scanner;

public class ProfitCalculatorClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bying Price");
		int buyingPrice = scanner.nextInt();
		System.out.println("Enter Selling Price");
		int sellingPrice = scanner.nextInt();
		
		scanner.close();
		int profit = 0;
		profit  =(int)Profit(buyingPrice,sellingPrice);
		
		System.out.println("profit = " + profit);

	}
	public static double Profit(int buyingPrice, int sellingPrice) {
		int profit = sellingPrice - buyingPrice;
		return profit;
	}
}