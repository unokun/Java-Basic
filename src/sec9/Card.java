package sec9;

public class Card {
	private static final int SUIT_SPADE = 1;
	private static final int SUIT_HEART = 2;
	private static final int SUIT_CLUB = 3;
	private static final int SUIT_DIAMOND = 4;

	private static final boolean STATUS_FRONT = true;
	private static final boolean STATUS_BACK = false;
	
	int suit;
	int number;
	boolean status;
	
	Card(int suit, int number, boolean status) {
		this.suit = suit;
		this.number = number;
		this.status = status;
	}
	Card(int suit, int number) {
		this(suit, number, STATUS_BACK);
	}
	private Card() {
		
	}
	void reverse() {
		status = !status; 
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		switch (suit) {
		case SUIT_SPADE:
			builder.append("スペード");
			break;
		case SUIT_HEART:
			builder.append("スペード");
			break;
		case SUIT_CLUB:
			builder.append("クラブ");
			break;
		case SUIT_DIAMOND:
			builder.append("ダイヤ");
			break;
			
		}
		builder.append("/");
		builder.append(number);
		builder.append("/");
		builder.append(status);
		
		return builder.toString();
	}


	public static void main(String[] args) {
		Card card1 = new Card(SUIT_HEART, 5);
		Card card2 = new Card(SUIT_CLUB, 2, STATUS_BACK);
		System.out.println(card1);
		System.out.println(card2);
//		Card card = new Card();
//		card.suit = SUIT_SPADE;
//		card.number = 3;
//		card.status = STATUS_FRONT;
//		System.out.println(card);
	}

}
