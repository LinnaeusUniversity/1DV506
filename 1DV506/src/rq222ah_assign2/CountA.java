package rq222ah_assign2;

import java.util.Scanner;

public class CountA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Provide a line of text: ");
		String count_A_a = scan.nextLine();

		int nA = 0, na = 0;
		for (int i = 0; i < count_A_a.length(); i++) {
			if (count_A_a.charAt(i) == 'A') // counting number of Capital 'A'.
				nA++;
			if (count_A_a.charAt(i) == 'a') // counting number of Small 'a'.
				na++;
		}
		System.out.println("Number of 'A': " + nA);
		System.out.println("Number of 'a': " + na);
		scan.close();
	}

}
