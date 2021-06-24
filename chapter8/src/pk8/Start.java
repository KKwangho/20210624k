package pk8;

import java.util.Random;

public class Start {

	private int random = new Random().nextInt(50) + 1;
	private int count;
	private String result = "FAIL";
	

	public String check(int n) { // 사용자가 입력한 숫자

		count++;
		
		// if문으로 'UP' / 'DOWN' 구현
		if (n < random) {
			System.out.println("UP!!");
		} else if (n > random) {
			System.out.println("DOWN!!");
		} else {
			System.out.println(count+ "회 만에 정답!!!");
			result ="SUCCESS";
		}
		return result;
	}
}
