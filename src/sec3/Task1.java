package sec3;

public class Task1 {

	/**
	 * 偶数判定
	 * @param value 判定する値
	 * @return 偶数の場合にはtrue、奇数の場合にはfalse
	 */
	public static boolean isEven(int value) {
		return ((value % 2) == 0);
	}
	/**
	 * サイコロをふる
	 * サイコロの目の計算方法
	 * Math.randomを使う。
	 * Math.randomは0以上1未満を返すため6倍して1を加える。
	 * @return サイコロの目(1以上6以下の整数値)
	 */
	public static int throwDice() {
		return (int) (Math.random() * 6 + 1);
		
	}
	public static void main(String[] args) {
		int dice = throwDice();
		
		System.out.println("サイコロの数字: " + dice);
		System.out.println("サイコロの目は" + (Task1.isEven(dice) ? "偶数" : "奇数") + "です");
	}

}
