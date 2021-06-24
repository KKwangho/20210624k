package pk8;

public class Student {
	
	//필드
	int studentID;
	String studentName;//="김치즈";
	int grade;
	String address;//="서울시 강서구";
	
	//생성자(기본생성자) : free compile
	//메서드
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = "박수";
	}
	
	public String getAddress() {
		return address="지구";
	}
	
	public void setAddress(String address) {
		this.address = "경기도 고양시";
	}
	
}
