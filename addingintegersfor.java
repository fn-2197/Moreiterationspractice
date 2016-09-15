package iterationsloops;

import java.util.Scanner;

public class addingintegersfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbscanner = new Scanner(System.in);
		System.out.println("Number of integers? ");
		int n =  kbscanner.nextInt();
		int i = 0;
		for(int j = n; j>0; j--){
			System.out.println("Enter an Integer: ");
			i +=  kbscanner.nextInt();			
		}
		System.out.println("The total is: " + i);
	}

}
