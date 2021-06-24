package pk8;

public class Can {
	
	private String canName;
	private int price;
	
	//생성자
	public Can(String canName, int price) {
		this.canName=canName;
		this.price=price;
		
	}

	public String getCanName() {
		return canName;
	}

	public void setCaName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
