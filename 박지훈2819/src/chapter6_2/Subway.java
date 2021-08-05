package chapter6_2;

public class Subway {
	private String SubwayNumber;//ÁöÇÏÃ¶ ¹øÈ£
	private int passengerCount;//Å¾½ÂÁßÀÎ ½Â°´¼ö
	private int money;//¼öÀÔ

	public Subway(String SubwayNumber) {
		this.SubwayNumber=SubwayNumber;
		passengerCount=0;
		money=0;
	}
	
	public void take(int money) {
		this.money+=money;//+=ÀÇ ÀÇ¹Ì´Â Å»¶§ ¸¶´Ù µ·ÀÌ ½×ÀÌ±â ¶§¹®
		passengerCount++;
	}
	
	public void getoff() {
		passengerCount--;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶"+SubwayNumber+"ÀÇ ½Â°´Àº "+passengerCount+"¸í ÀÔ´Ï´Ù");
		System.out.println("ÃÑ¼öÀÔÀº "+money+"ÀÔ´Ï´Ù.");
	}

}
