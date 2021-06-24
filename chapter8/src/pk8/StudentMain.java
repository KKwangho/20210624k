package pk8;

public class StudentMain {

	public static void main(String[] args) {
		//필드를 사용하여 이름과 주소 출력
		
		//메서드를 사용하여 이름과 주소 출력
		Student stu=new Student();
		
		System.out.println("----필드 이용------");
		System.out.println(stu.studentName+", "+stu.address);
		System.out.println("---------메서드 이용------");

		stu.studentName="박수";
		stu.address="경기도 고양시";
		System.out.println(stu.studentName+", "+stu.address);
	}

}
