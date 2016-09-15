package iterationsloops;

import java.util.Scanner;

public class startandendvaluesforloop {
	public static void main(String[] args) {
	
		Scanner kbscanner = new Scanner(System.in);
		System.out.print("Starting value: ");
		int i = kbscanner.nextInt();
		System.out.print("/nEnding value: ");
		int f = kbscanner.nextInt();
		for (int j = i; i<=f; i++)
			System.out.println(i);
		
	
	}
}
