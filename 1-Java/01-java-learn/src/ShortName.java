import java.util.Scanner;
public class ShortName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Short Name");
		String shortName = in.nextLine(); //read string
		int count = shortName.length();
		if(count>=2 && count<=6 ) {
			System.out.println("This is a valid Short Name");
		} else {
			System.out.println("This is not a valid Short Name");
		}
		in.close();
	}

}
