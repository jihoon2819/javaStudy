package chapter6_4;

public abstract class Computer {
	//�߻�޼���
	public abstract void display();
	public abstract void typing();
	//�Ϲݸ޼���
	public void  trunOn() {
		System.out.println("������ �մϴ�");
	}
	public void  trunOff() {
		System.out.println("������ ���ϴ�");
	}

}
