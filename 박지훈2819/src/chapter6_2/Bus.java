package chapter6_2;

public class Bus {
	private String busNumber;//버스번호
	private int passengerCount;//탑승중인 승객수
	private int money;//수입

	public Bus(String busNumber) {
		this.busNumber=busNumber;
		passengerCount=0;
		money=0;
	}
	
	public void take(int money) {
		this.money+=money;//+=의 의미는 탈때 마다 돈이 쌓이기 때문
		passengerCount++;//값설정
	}
	
	public void getoff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("버스"+busNumber+"의 승객은 "+passengerCount+"명 입니다");
		System.out.println("총수입은 "+money+"입니다.");
	}
}
