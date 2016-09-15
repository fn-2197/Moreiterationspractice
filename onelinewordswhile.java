package iterationsloops;

import java.util.Scanner;

public class onelinewordswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner kbscanner= new Scanner(System.in);
		System.out.println("What is the first word?");
		String w = kbscanner.next();
		System.out.println("What is the secound word?");
		String t = kbscanner.next();
		int l = 30 - w.length() + t.length();
		System.out.print(w);
		while(l>0){
			System.out.print(".");
			l--;
		}
		System.out.print(t);
	}

}
