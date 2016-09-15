package iterationsloops;

import java.util.Scanner;

public class lastchancegas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner amount = new Scanner(System.in);
		System.out.println("Type your tank capacity: ");
		double c =  amount.nextInt();
		System.out.println("Gauge reading: ");
		double g = amount.nextInt();
		System.out.println("MPG: ");
		double m = amount.nextInt();
		if(200<=((c/100)*g)*m)
			System.out.println("Your good to go!");
		else
			System.out.println("Get Gas!");
		
	}

}
