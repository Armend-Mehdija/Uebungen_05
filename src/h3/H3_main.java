package h3;

import java.util.Arrays;

public class H3_main {
	public static void main (String [] args) {
		int [] [] einheiten;
		einheiten = new int [2] [15];
		int [] scheineUndMünzen = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
		int input = 208;
		int verbleibend = input;
		
		for (int i = 0; i < scheineUndMünzen.length; i++) {
			einheiten [0] [i] = scheineUndMünzen[i];
		}
		
		for (int i = 0; i < scheineUndMünzen.length; i++) {
			int zahlenWert = einheiten [0] [i];
			if (verbleibend >= zahlenWert) {
				int zähler = verbleibend / zahlenWert;
				einheiten [1] [i]= zähler;
			    verbleibend %= zahlenWert;
			}
		}
		System.out.println(Arrays.toString(einheiten [0]));
		System.out.println(Arrays.toString(einheiten [1]));
	}
}
