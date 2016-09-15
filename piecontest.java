package iterationsloops;

import java.util.*;

public class piecontest {
	public static void main(String[] args) {
		
		Scanner weight = new Scanner(System.in);
		System.out.println("What is your weight?");
		int w = weight.nextInt();
		if (220<=w && w<=280)
			System.out.println("You may compete.");
		else
			System.out.println("Get out.");
		
	}
}
