package meanProgram;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		MeanProgram tester = new MeanProgram();
		
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
		listOfNumbers.add(i);
		}
		
		System.out.println(tester.computeMean(listOfNumbers));


	
	}

}
