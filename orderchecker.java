package iterationsloops;

import java.util.Scanner;

public class orderchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner amount = new Scanner(System.in);
		System.out.println("Number of bolts:  ");
		int b =  amount.nextInt();
		Scanner nuts = new Scanner(System.in);
		System.out.println("Number of nuts:  ");
		int n =  nuts.nextInt();
		Scanner washers = new Scanner(System.in);
		System.out.println("Number of washers:  ");
		int w =  washers.nextInt();
		
		if (n<b)
			System.out.println("Check the order: too few nuts");
		if (w<b*2)
		System.out.println("Check the order: too few washers");
		
		if (n>=b && w>=b*2)
			System.out.println("Order is OK");
		
		System.out.println("Total cost: " + (b*5 + n*3 + w));
	}

}
