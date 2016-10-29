package sec11;

import java.util.Date;

public class Food {
	private String name;
	private int price;
	private String bestBefore;
	
	public Food(String name, int price, String bestBefore) {
		this.name = name;
		this.price = price;
		this.bestBefore = bestBefore;
		
	}
	public Food(String name, int price) {
		this(name, price, "");
		
	}
	@SuppressWarnings("unused")
	private Food() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBestBefore() {
		return bestBefore;
	}
	public void setBestBefore(String bestBefore) {
		this.bestBefore = bestBefore;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name)
			   .append("の部段は")
			   .append(price)
			   .append("円、賞味期限は")
			   .append(bestBefore)
			   .append("です");
		return builder.toString();
	}
	
	
}
