package chapter6_2;

public class Subway {
	private String SubwayNumber;//����ö ��ȣ
	private int passengerCount;//ž������ �°���
	private int money;//����

	public Subway(String SubwayNumber) {
		this.SubwayNumber=SubwayNumber;
		passengerCount=0;
		money=0;
	}
	
	public void take(int money) {
		this.money+=money;//+=�� �ǹ̴� Ż�� ���� ���� ���̱� ����
		passengerCount++;
	}
	
	public void getoff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("����ö"+SubwayNumber+"�� �°��� "+passengerCount+"�� �Դϴ�");
		System.out.println("�Ѽ����� "+money+"�Դϴ�.");
	}

}
