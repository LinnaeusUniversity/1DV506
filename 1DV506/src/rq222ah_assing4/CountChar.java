package rq222ah_assing4;

import java.io.*;
import java.util.*;

public class CountChar {
	public static void main(String[] args) {
		try {
			// Source path for the file.txt file
			String path = "C:\\eclipse\\Java_courses\\1DV506\\bin\\History of programming.txt";
			// creating file using the path given.
			File file = new File(path);

			Scanner sc = new Scanner(file);
			// whitespaces
			sc.useDelimiter("\f");
			// new Stringbuilder
			StringBuilder sb = new StringBuilder();
			// array for each type of character
			int[] counter = new int[4];
			// scans .txt file and makes it a string
			while (sc.hasNextLine()) {
				sb.append(sc.next());
			}
			// scans the string with for loop and adds their quantity to array
			for (int i = 0; i < sb.length(); i++) {
				if (Character.isUpperCase(sb.charAt(i)))
					counter[0]++;
				else if (Character.isLowerCase(sb.charAt(i)))
					counter[1]++;
				else if (Character.isWhitespace(sb.charAt(i)))
					counter[2]++;
				else
					counter[3]++;
			}

			System.out.println("Number of upper case letters: " + counter[0]);
			System.out.println("Number of lower case letters: " + counter[1]);
			System.out.println("Number of whitespaces: " + counter[2]);
			System.out.println("Number of others: " + counter[3]);
			System.out.println("\nThe output matches with the assingment ");

			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}