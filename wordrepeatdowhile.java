package iterationsloops;

import java.util.Scanner;

public class wordrepeatdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbscanner = new Scanner(System.in);
		System.out.print("Your word: ");
		String i = kbscanner.next();
		int j = i.length();
		do{
					System.out.println(i);
			j--;
		}while(j>0);
	}

}
