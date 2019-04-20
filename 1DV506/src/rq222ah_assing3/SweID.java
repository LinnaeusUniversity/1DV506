package rq222ah_assing3;

public class SweID {

	public static void main(String[] args) {
		// ******************************
		String str = "551314-0913";
		// String str=str2.replaceAll("-", "");
		getFirstPart(str);
		getSecondPart(str);
		// **********************************

		System.out.println(isFemaleNumber(str));

//************************************************		
	}

	/*
	 * 1.Methods getFirstPart(String sweID) and getSecondPart(String sweID),
	 * returning the first part (YYMMDD) and second part (NNNN) of the identity
	 * number, respectively.
	 */
	public static String getFirstPart(String sweID) {

		System.out.println("First part");
		for (int i = 0; i < sweID.length() - 5; i++) {
			// sweID.charAt(i);
			System.out.print(sweID.charAt(i));
		}
		return sweID;
	}

	public static String getSecondPart(String sweID) {
		System.out.println("\nSecond part");
		for (int i = 7; i < sweID.length(); i++) {
			System.out.print(sweID.charAt(i));

		}
		System.out.println("\n");

		return sweID;
	}

	public static boolean isFemaleNumber(String sweID) {
		boolean isFemaleNumber = true;
		int a = sweID.length() - 2;
		if (sweID.charAt(a) % 2 == 1)
			isFemaleNumber = false;
		System.out.print("The Female given ID is: ? ");
		return isFemaleNumber;
	}

	public static boolean isCorrect(String str) {

		String str1 = str.replaceAll("-", "");

		String dat = str1.substring(4, 6);
		int date = Integer.parseInt(dat);

		String mm1 = str1.substring(2, 4);
		int mm = Integer.parseInt(mm1);

		char[] id = str1.toCharArray();
		int sum1 = 0;
		int sum2 = 0;

		if (date < 0 || date > 31) {
			System.out.println("Invalid Date!");
		} else if (mm < 0 || mm > 12) {
			System.out.println("Invalid Month!");
		}

		else if (date > 0 && date < 32 && (mm < 13 && mm > 0)) {

			for (int i = 0; i < id.length - 1; i = i + 2) {

				int first = Character.getNumericValue(id[i]) * 2;
				if (first > 9) {
					first = (first / 10) + (first % 10);

				}
				sum1 = first + sum1;
			}

			for (int j = 1; j < id.length - 2; j = j + 2) {
				int second = Character.getNumericValue(id[j]);
				sum2 = second + sum2;
			}

		}

		int sum3 = (sum1 + sum2) % 10;
		int last = 10 - sum3;

		boolean isCorrect;
		if (Character.getNumericValue(id[9]) != last) {
			isCorrect = false;
		} else {
			isCorrect = true;
		}

		return isCorrect;
	}
}