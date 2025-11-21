package h2;

public class H2_main {
	public static void main (String[] args) {
		int n = 299, digits = 0;
		int [] a;
		a = new int [9];;
	    int t = 1;
	    while (t <= n) {
	    	digits++;
	    	t *= 10;
	    }
	    if (n == 0) {
	    	digits = 1;
	    }
	    for(int i = 0; i < digits; i++) {
	    	int d = n % 10;
	    	a[8-i] = d;
	    	n /= 10;
	    	
	    }
	    System.out.println("Die Länge der Zahl beträgt: " + digits);
	    System.out.println("Das Array: ");
	    for (int i = 0; i < a.length ; i++) {
	    	System.out.print(a[i] + "");
	    }
	}
}
