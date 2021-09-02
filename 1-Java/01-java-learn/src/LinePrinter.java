
public class LinePrinter {

	public static void main(String[] args) {
		printLine();
		printLine(15);
		printLine(10);
		printLine(25);
		printLine(35,'A');
		//Method Overloading
		//
	}
	public static void printLine() {
		System.out.println("---------------------------");
	}
	public static void printLine(int numberOfCharacter) {
		for(int i = 0; i < numberOfCharacter; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void printLine(int numberOfCharacter, char character) {
		for(int i = 0; i < numberOfCharacter; i++) {
			System.out.print(character);
		}
		System.out.println();
	}
}
