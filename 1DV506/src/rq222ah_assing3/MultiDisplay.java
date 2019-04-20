package rq222ah_assing3;

public class MultiDisplay {

	private String message;
	private int count;

	public void setDisplayMessage(String m) {

		message = m;

	}

	public void setDisplayCount(int c) {

		count = c;
	}

	public void display() {

		for (int i = 0; i < count; i++)
			System.out.println(message);

	}

	public String getDisplayMessage() {

		return message;

	}

	public void display(String m, int c) {

		message = m;
		count = c;
		display();

	}

}
