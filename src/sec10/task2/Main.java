package sec10.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Grade> gradeList = new ArrayList<>();
		gradeList.add(new Grade("伊藤", 60));
		gradeList.add(new Grade("鈴木", 88));
		gradeList.add(new Grade("佐藤", 40));
		gradeList.add(new Grade("中山", 74));
		gradeList.add(new Grade("池田", 95));
		gradeList.add(new Grade("池山", 80));
		
		for (Grade grade : gradeList) {
			System.out.println(grade.getName() + ":" + grade.judge());
		}
	}

}
