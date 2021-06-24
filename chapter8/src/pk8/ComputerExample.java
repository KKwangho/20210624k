package pk8;

public class ComputerExample {

	public static void main(String[] args) {

		Computer myCom=new Computer();
		
		int[] values1= {1,2,3,4};
		
		int result1=myCom.sum1(values1);
		System.out.println("re1: "+result1);
		
		//int[] values=new int[] {1,2,3,4,5}
		//배열의 가변형 매개변수
		int result2=myCom.sum1(new int[] {1,1,1,1,1,1,1,1,1});
		//myCom.sum1(values1);
		
		System.out.println("re2: "+result2);
		
		System.out.println("==============================");
		
		int result3=myCom.sum2(1,2,3);
		System.out.println("re3: "+result3);
		
		int result4=myCom.sum2(1,2,3,4,5,6,7,8);
		System.out.println("re4: "+result4);
						
		int result5=myCom.sum3();
		System.out.println("re5:"+result5);
	}

}
