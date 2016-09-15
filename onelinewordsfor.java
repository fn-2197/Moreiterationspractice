package iterationsloops;

import java.util.Scanner;

public class onelinewordsfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbscanner= new Scanner(System.in);
		System.out.println("What is the first word?");
		String w = kbscanner.next();
		System.out.println("What is the secound word?");
		String t = kbscanner.next();
		int l = w.length() + t.length();
		System.out.print(w);
		for(int j = 30 - l; j>0; j--)
			System.out.print(".");
		System.out.print(t);
	}

}
