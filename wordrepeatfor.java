package iterationsloops;

import java.util.Scanner;

public class wordrepeatfor {
	public static void main(String[] args) {
		
		Scanner kbscanner = new Scanner(System.in);
		System.out.print("Your word: ");
		String i = kbscanner.next();
		int j = i.length();
		for(int l = j; l>0; l--)
			System.out.println(i);
		
	}
}
