
public class DocumentListing {

	public static void main(String[] args) {
		String[] documents = {"Driving License", "Passport", "Last 3 months Bank Statement",
		                    "Salary Slips of last 3 months", "2 Passport Size Photographs"};
		                    		
		for(int i=1; i<6; i++) {
			System.out.println(i+")   " + documents[i-1]);
			
		}		
	}

}
