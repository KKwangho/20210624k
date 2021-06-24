package pk8;

public class DmbCellphoneExample {

	public static void main(String[] args) {

		DmbcellPhone dmbcell = new DmbcellPhone("JavaPhone", "힌색", 11);
		
		//CdellPhone
		System.out.println("모델 :"+dmbcell.model);
		System.out.println("모델 :"+dmbcell.color);
		
		
		System.out.println("모델 :"+dmbcell.channel);
		
		dmbcell.powerOn();
		dmbcell.bell();
		dmbcell.sendVoice("여보세요?");
		dmbcell.receVoice("안녕하세요 저는 이호진입니다");
		dmbcell.sendVoice("아 안녕! 공부좀하세요!");
		dmbcell.receVoice("싫어요~~");
		
		//DmbcellPhone으로 부터 메서드 호출
		dmbcell.turnOnDmb();
		dmbcell.changeChannelDmb(3);
		dmbcell.turnOffDmb();
	}

}
