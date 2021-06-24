package pk8;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		//변수선언
		String select="";
		int money=0;
		
		//객체선언
		Vending ven=new Vending();
		ven.init(); // 음료수 셋팅 완료
		
		//입력받아 showCans 호출
		System.out.println("돈을 투입하세요 :");
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
		ven.showCans(money);
						
		//입력받아 outCan 호출
		System.out.println("음료수를 선택하세요 :");
		select=scan.next();
		ven.outCan(select);
				
		
	}

}
