package pk8;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		
		TimesTable tt=new TimesTable();
		
		int num;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("몇 단? :");
		num=scan.nextInt();		
		
		tt.showTable(num);

	}

}
