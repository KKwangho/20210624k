package pk8;

public class StdInfo {
	
	public String studentName;
	public int grade;
	public int money; //5000
	
	//생성자(오버로딩) studentName 과 money는 갖고 태어남
	public StdInfo(String studentName, int money) {
	this.studentName=studentName;
	this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money-=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money);
	}

}
