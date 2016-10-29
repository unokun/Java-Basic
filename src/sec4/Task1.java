package sec4;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		int[] tmpArray = {63, 18, 64, 97, 50, 98};
		// 1
		for (int i = 0; i < tmpArray.length; i++) {
			System.out.println(tmpArray[i]);
		}
		// 2 
		for (int value : tmpArray) {
			System.out.println(value);
			
		}
		// int[] = {1,2,4,5}
		// LinkedList
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(4);
		arrayList.add(5);
		// 1
		for (int i = 0 ; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
		//2
		for (int value : arrayList) {
			System.out.println(value);
			
		}
		
		int[][] scores = {{59, 39, 100, 2, 15, 40, 84, 97}, {63, 18, 64, 97, 50, 98}};
		// scores[0] ---> int[] {59, 39, 100, 2, 15, 40, 84, 97}
		// scores[1] ---> int[] {63, 18, 64, 97, 50, 98}
		int count = 0;
		int sum = 0;
		for (int[] scoreArray : scores) {
			for (int score : scoreArray) {
				sum += score;
				count += 1;
			}
		}
//		System.out.println("合計: " + sum);
		System.out.println("平均値: " + (sum / count));
	}

}
