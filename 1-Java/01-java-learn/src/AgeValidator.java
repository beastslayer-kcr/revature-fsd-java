import java.util.Scanner;

public class AgeValidator {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("enter Age");
		int age = in.nextInt();
		in.close();
		if(age >= 18) {
			System.out.println("Can Vote");	
		}
		else {
			System.out.println("Can't Vote");
		}
	}

}

