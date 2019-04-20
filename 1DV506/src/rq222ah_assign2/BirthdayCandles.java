package rq222ah_assign2;

public class BirthdayCandles {

	public static void main(String[] args) {
		int year = 1, candle = 0, box = 0, sumOfBoxes = 0;

		for (year = 1; year <= 7; year++) {
			while (candle < year) {
				box++;
				sumOfBoxes++;
				candle = candle + 24;
			}

			if (box > 0) {
				System.out.println("Before " + year + " birthday, " + " buy " + box + " box(es)");
			}

			candle = candle - year;
			box = 0;
		}

		System.out.println("Total boxes: " + sumOfBoxes + " Candles left: " + candle);
	}
}