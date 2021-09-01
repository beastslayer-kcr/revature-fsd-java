import java.util.Scanner;
public class CelsiusFahrenheit {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter temprature in celsius");
		int celsius = in.nextInt();
		float fahrenheit = (celsius * 9.0f)/5.0f + 32.0f;
		System.out.println("Fahrenheit = " + fahrenheit);
		in.close();
	}

}
