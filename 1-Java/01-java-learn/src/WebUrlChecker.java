import java.util.Scanner;
public class WebUrlChecker {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Website address:");
		String url  = in.nextLine();
		in.close();
		if (url.startsWith("http://") || url.startsWith("https://")) {
			System.out.println("This is a Web URL");
		} else {
			System.out.println("This is a NOT web URL.");
		}
	}

}
