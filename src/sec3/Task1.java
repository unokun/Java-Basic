package sec3;

public class Task1 {

	public static void main(String[] args) {
		// サイコロの目の計算方法
		// Math.randomは0以上1未満
		int dice = (int) (Math.random() * 6 + 1);
		
		System.out.println("サイコロの数字: " + dice);
		System.out.println("サイコロの目は" + (((dice % 2) == 0) ? "偶数" : "奇数") + "です");
	}

}
