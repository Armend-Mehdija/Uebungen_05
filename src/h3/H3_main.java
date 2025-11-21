package h3;

public class H3_main {
	public static void main (String [] args) {
		int [] [] einheiten = {{50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
							   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
		int input = 208;	
		System.out.println("Unser Input: " + input);
		
		for (int i = 0; i < einheiten[0].length; i++) {
			if (input >= einheiten [0] [i]) {
				einheiten [1] [i]= input / einheiten [0] [i];
			    input %= einheiten [0] [i];
			}
		}
		System.out.println("Diese Scheine / Münzen stehen zur Verfügung: ");
		for (int i = 0; i < einheiten[0].length ; i++) {
	    	System.out.print(einheiten[0] [i] + "\n ");
		}
		System.out.println("Diese Scheine / Münzen benötigen wir: ");
		for (int i = 0; i < einheiten[1].length ; i++) {
	    	System.out.print(einheiten[1] [i] + "");
		}
	}
}
