package rq222ah_assign2;
public class Divisible {

	public static void main(String[] args) {

		int r = 0;
		for (int i = 100; i < 201; i++) {
			if ((i % 4 == 0 || i % 5 == 0) && i % 20 != 0) {

				System.out.print(i + " ");
				r++;
				if (r > 9) {
					System.out.println("");
					r = 0;
				}

			}

		}
	}
}
