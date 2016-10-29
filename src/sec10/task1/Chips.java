package sec10.task1;

public class Chips {
    private int num;    // チップの数
    
    public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Chips(int num) {
        this.num = num;
    }
  
    // チップの数を増減
    void change(int num) {
        this.num += num;
    }
}
