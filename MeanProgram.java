package meanProgram;

import java.util.ArrayList;

public class MeanProgram {
	
	public double computeMean(ArrayList<Integer> listOfNumbers) {
		int sum = 0;
		
		for (int singleNumber : listOfNumbers) {
			sum = sum + singleNumber;
			
		}
		
		return sum / (double) listOfNumbers<>();
		
		
	}
	

}
