package h2;

import java.util.Arrays;

public class H2_main {
	public static void main (String[] args) {
		int n = 5930537, digits = 2;
		int [] a;
		a = new int [9];
		int index = a.length -1;
	    digits = String.valueOf(n).length();
	    for(int i = 0; i < digits; i++) {
	    	int d = n % 10;
	    	a[index] = d;
	    	n /= 10;
	    	index--;
	    }
	    System.out.println("Die Länge der Zahl beträgt: " + digits);
	    System.out.println("Das Array: " + Arrays.toString(a));
	}
}
