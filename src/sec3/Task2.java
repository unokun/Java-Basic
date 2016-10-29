package sec3;

import java.util.Scanner;

public class Task2 {
	// じゃんけんの選択肢
	private static final int GU = 0;
	private static final int CHOKI = 1;
	private static final int PA = 2;

	// 判定結果
	private static final int WIN = 1;
	private static final int LOSE = 2;
	private static final int DRAW = 3;

	/**
	 * じゃんけんの選択 
	 * 
	 * 標準入力から選択肢を入します。
	 * 選択肢が入力されるまで、何度も入力を受け付けます。
	 * 
	 * @param scanner
	 * @return
	 */
	static int getChoice() {
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				System.out.println("[じゃんけん]: 0:グー 1:チョキ 2:パー");
				String choice = scanner.next();
				if (choice.equals("0") || choice.equals("1") || choice.equals("2")) {
					return Integer.parseInt(choice);
				}
			}
		}
	}

	/**
	 * 判定
	 * 
	 * @param me
	 * @param com
	 * @return
	 */
	static int judge(int me, int com) {
		if (me == com) {
			return DRAW;
		}
		if ((me == GU    && com == CHOKI) || 
	    	(me == CHOKI && com == PA))
		 {
			return WIN;
		}
		
		if (me == CHOKI && com == PA) {
			return WIN;
		}
		

		
		switch (me) {
		case GU:
			if (com == CHOKI) {
				return WIN;
			}
			break;
		case CHOKI:
			if (com == PA) {
				return WIN;
			}
			break;
		case PA:
			if (com == GU) {
				return WIN;
			}
			break;
		}
		return LOSE;
	}

	public static void main(String[] args) {
		// 1)ユーザーの選択
		int userChoice = getChoice();
		System.out.println("自分: " + userChoice);

		// 2)コンピュータの選択
		int compChoice = (int) ((Math.random() * 10) % 3);
		System.out.println("相手: " + compChoice);

		// 3)判定し、結果を出力します
		int result = judge(userChoice, compChoice);
		switch (result) {
		case WIN:
			System.out.println("結果: Win!!");
			break;
		case LOSE:
			System.out.println("結果: Lose!!");
			break;
		case DRAW:
			System.out.println("結果: Draw!!");
			break;
		}

	}
}
