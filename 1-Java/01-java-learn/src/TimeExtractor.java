import java.util.Scanner;
public class TimeExtractor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter time in format of hh:mm:ss");
		String time = in.nextLine();
		/*
		String[] times = time.substring(0,7).split(":");
		
		int minutes = Integer.parseInt(times[1]);
		System.out.println(minutes); */
		in.close();
		String[] splitInto = time.split(":"); 
		System.out.println(splitInto[1]);
	}

}
