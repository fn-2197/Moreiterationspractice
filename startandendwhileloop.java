package iterationsloops;

import java.util.Scanner;

public class startandendwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbscanner = new Scanner(System.in);
		System.out.print("Starting value: ");
		int i = kbscanner.nextInt();
		System.out.print("Ending value: ");
		int f = kbscanner.nextInt();
		while (i<=f){
			System.out.println(i);
			i++;
		}
		
	}

}
