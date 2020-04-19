package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker; 
	private int price = 10000;
	
	// ������
	public SamsungTV() {
		System.out.println("==> SamsungTV ��ü ����");
	}
	/*
	public SamsungTV(Speaker speaker) {
		System.out.println("==> SamsungTV(2) ��ü ����"); 
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("==> Samsung(3) ��ü ����");
		this.speaker = speaker; 
		this.price = price; 
	} */ 
	
	// setter �޼��� 
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() ȣ��");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("===> setPrice() ȣ��");
		this.price = price;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV-- ���� �Ҵ�. ���� : " + price); 
	}
	public void powerOff() {
		System.out.println("SamsungTV-- ���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown(); 
	}
}
