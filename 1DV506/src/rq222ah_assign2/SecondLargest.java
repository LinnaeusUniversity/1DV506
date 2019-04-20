package rq222ah_assign2;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Provide 10 integers: ");

		int temp, max, second;

		max = scan.nextInt();
		second = scan.nextInt();
		for (int i = 1; i < 9; i++) {
			temp = scan.nextInt();
			if (temp > max) {
				second = max;
				max = temp;
			}
			if (temp < max && temp > second)
				second = temp;
		}
		System.out.print("The second largest is: " + second);
		scan.close();
	}

}

