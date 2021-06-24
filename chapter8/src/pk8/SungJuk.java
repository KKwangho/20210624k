package pk8;

import javax.swing.JOptionPane;

public class SungJuk {
	
	//멤버변수=필드
	private String Std_num; // 동일 클래스에서만 사용가능
	private String Std_name; 
	private int Java, Python, BigData;
	
	//생성자
	
	//메서드
	public void Sum() {
		System.out.println("합계는 :"+(Java+Python+BigData));
	}
	
	public void Avg() {
		System.out.println("평균 :"+(Java+Python+BigData)/3);
		
	}

	public static void main(String[] args) {
		//rec 객체
		SungJuk rec=new SungJuk();
		AccessEx rec2=new AccessEx();
		
		rec2.SetA(100);
		rec2.bb=200;
		rec2.cc=300;
		
		rec2.Disp();
		
		rec.Std_num=JOptionPane.showInputDialog("학번");
		rec.Std_name=JOptionPane.showInputDialog("성명");

		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Java"));
		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Python"));
		rec.Java=Integer.parseInt(JOptionPane.showInputDialog("Bigdata"));

		System.out.println(rec.Std_num+", "+rec.Std_name+"의 성적 입니다.");
		rec.Sum();
		rec.Avg();
	}

}
