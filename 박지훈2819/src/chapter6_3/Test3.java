package chapter6_3;

public class Test3 extends Test1 {

	public Test3() {
		super("�ڽ�2");//�� �����Ǿ��ִ�.// �θ��� �����ڸ� ȣ��
		System.out.println("�ڽ� 2Ŭ����");
	}
	@Override
	public void add() {
		System.out.println("�׼��� ���մϴ�.");
	}
	public void sub() {
		System.out.println("�� ���� �N�ϴ�.");
	}
}
