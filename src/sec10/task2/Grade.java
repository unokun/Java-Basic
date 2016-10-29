package sec10.task2;

public class Grade {

	private String name;
	private int score;
	
	public Grade(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@SuppressWarnings("unused")
	private Grade() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String judge() {
		if (score >= 90) {
			return "AA";
		}
		if (score >= 80) {
			return "A";
		}
		if (score >= 70) {
			return "B";
		}
		if (score >= 60) {
			return "C";
		}
		return "不可";
	}
}
