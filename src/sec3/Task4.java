package sec3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("コイントス試行回数を入力してください");
			int trial = scanner.nextInt();
			int even = 0;
			int odd = 0;
			for (int i = 0; i < trial; i++) {
				int toss = (int)(Math.random() * 2);
				if ((toss % 2) == 0) {
					even += 1;
				} else {
					odd += 1;
				}
			}
			System.out.println("表: " + even + " 裏: " + odd);
		}
		
	}

}
