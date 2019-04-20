package rq222ah_assing3;

public class Card {

	private Rank rank;
	private Suite suite;

	public enum Rank {

		ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12),
		KING(13);

		private final int value;

		Rank(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	};

	public enum Suite {

		HEARTS, SPADES, CLUBS, DIAMONDS
	};

	public Card(Rank rank, Suite suite) {
		this.rank = rank;
		this.suite = suite;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suite getSuite() {
		return suite;
	}

	public void setSuite(Suite suite) {
		this.suite = suite;
	}

	public String toString() {
		return "Card {rank=" + rank + ", suite=" + suite + "}";
	}

}
