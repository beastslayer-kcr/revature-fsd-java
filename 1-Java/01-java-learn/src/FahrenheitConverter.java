import java.util.Scanner;
public class FahrenheitConverter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter celsius");
		float celsius = in.nextFloat();
		System.out.println("Fahrenheit: " + toFahrenheit(celsius));
		
	}
	public static float toFahrenheit(float celsius) {
		float fahrenheit = (celsius * 9 / 5.0f) + 32;
		return fahrenheit;
	}
}
