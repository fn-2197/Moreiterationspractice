package iterationsloops;

import java.util.Scanner;

public class addingupintegersdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbscanner = new Scanner(System.in);
		System.out.println("Number of integers? ");
		int n =  kbscanner.nextInt();
		int i = 0;
		do{
			System.out.println("Enter an Integer: ");
			i +=  kbscanner.nextInt();
			n--;
		}while(n>0);
		System.out.println("The total is: " + i);
		
	}

}
