package chapter6_4;

public abstract class Computer {
	//추상메서드
	public abstract void display();
	public abstract void typing();
	//일반메서드
	public void  trunOn() {
		System.out.println("전원을 켭니다");
	}
	public void  trunOff() {
		System.out.println("전원을 끕니다");
	}

}
