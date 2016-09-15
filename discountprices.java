package iterationsloops;

import java.util.Scanner;

public class discountprices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kbscanner = new Scanner(System.in);
		System.out.println("Enter amount of purchases: ");
		int n =  kbscanner.nextInt();
		if(n>1000)
			n= (n/10)*9;
		System.out.println("Your discounted price is: " + n);
		
	}

}
