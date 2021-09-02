
public class AverageCalculatorLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total = 0.0f;
		float[] scores = { 48, 55, 92, 78, 64};
		/*for(int i=0; i < scores.length; i++) {
			total += scores[i];
		}*/
		for (float score : scores) {
			total += score;
		}
		
		
		System.out.println("average is " + (total / scores.length));

	}

}
