package pk8;

public class TakeTrans {

	public static void main(String[] args) {

		StdInfo studentJames=new StdInfo("James", 5000);
		StdInfo studentJames2=new StdInfo("Jame2", 1000000);
		StdInfo studentTomas=new StdInfo("Tomas", 10000);
		StdInfo studentTomas2=new StdInfo("Tomas2", 100);
		
		Bus bs100=new Bus(100);
		studentJames.takeBus(bs100);
		studentJames.showInfo();
		bs100.busInfo();
		
		Subway subwayGreen=new Subway("2호선");
		studentTomas.takeSubway(subwayGreen); // 지하철 수입증가, 승객증가
		studentTomas.showInfo(); //학생정보
		subwayGreen.subwayInfo(); //지하철 정보
		
		studentTomas2.takeSubway(subwayGreen);
		studentTomas2.showInfo();
		subwayGreen.subwayInfo();
		
	}
	

}
