package rq222ah_assign2;
public class Reverse {

	public static void main(String[] args) {

		char[] text = { '!', 'y', 's', 'a', 'E', ' ', 's', 'a', 'w', ' ', 's', 'i', 'h', 'T' };

		System.out.println(text);
		char[] reverseText = new char[text.length];

		for (int i = 0; i < text.length; i++) {
			reverseText[i] = text[text.length - i - 1];
			// System.out.print(text[i]);
		}

		System.out.print("The reverse order: ");
		System.out.print(reverseText);

	}

}
