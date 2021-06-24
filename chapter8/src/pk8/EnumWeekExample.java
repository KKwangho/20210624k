package pk8;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week today=null;
						
		Calendar cal=Calendar.getInstance();
		int week=cal.get(Calendar.DAY_OF_WEEK); //일요일 1 ~ 토요일 7
		
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
			
		case 2:
			today=Week.MONDAY;
			break;
			
		case 3:
			today=Week.TUESDAY;
			break;
			
		case 4:
			today=Week.WENDESDAY;
			break;
			
		case 5:
			today=Week.THURSDAY;
			break;
			
		case 6:
			today=Week.FRIDAY;
			break;
			
		case 7:
			today=Week.TATURDAY;
			break;
			
		}
		System.out.println("오늘 요일 : "+today);
		
		if(today==Week.SUNDAY) {
			System.out.println("잔다");
		}
	}

}
