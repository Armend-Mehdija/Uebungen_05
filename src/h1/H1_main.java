package h1;

import java.util.Arrays;

public class H1_main {
	public static void main (String[] args) {
		int [] myArray = {4, 1, 2, 8, 30};
		for(int i = 0 ; i < myArray.length / 2 ; i++) {
			int t = myArray[i];
			myArray[i] = myArray[myArray.length -1 -i];
			myArray[myArray.length -1 -i] = t;
		}
		System.out.println("" + Arrays.toString(myArray));
		
	}
}
