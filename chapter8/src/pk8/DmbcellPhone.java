package pk8;

public class DmbcellPhone extends CellPhone{
	
	//필드
	int channel=5;;
	
	//생성자
	public DmbcellPhone(String model, String color, int channel) {
		this.model=model;
		this.color=color;
		this.channel=channel;
	}

		//메서드
	void turnOnDmb() {
		System.out.println("DMB방송을 켭니다"+channel);
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널"+channel+"번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}
}
