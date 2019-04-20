package rq222ah_assing3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private List<Card> cards = new ArrayList<>(52);

	public Deck() {
		reset();
	}

	public void shuffle() {
		Random shuffle = new Random();
		if (cards.size() == 52) {

			for (int i = 0; i < 52; i++) {
				Card temp = cards.get(i);
				int x = shuffle.nextInt(52);
				cards.set(i, cards.get(x));
				cards.set(x, temp);
			}
		}

		else
			System.err.println("You must have 52 cards in the deck");

	}

	public void deal() {
		System.out.println(cards.remove(cards.size() - 1));
	}

	public void deal(int x) {
		for (int i = 0; i < x; i++)
			System.out.println(cards.remove(cards.size() - 1));

	}

	public void reset() {
		cards.clear();
		for (Card.Suite suite : Card.Suite.values()) {
			for (Card.Rank rank : Card.Rank.values()) {
				Card card = new Card(rank, suite);
				cards.add(card);
			}
		}
	}

	public int getDeckSize() {
		return cards.size();
	}

}
