package chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		super("�ڽ�1");//�� �����Ǿ��ִ�.// �θ��� �����ڸ� ȣ��//���۶�� �����ڴ� ������ ���� ���� �־�� �Ѵ�.
		System.out.println("�ڽ� 1Ŭ����");
	}

	// �������̼�
	@Override
	public void add() {
		System.out.println("������ ���մϴ�.");// �ڽĿ��� ������ �ϴ°��� �������̵��̶�� �Ѵ� .
	}
	 
	public void sub() {
		System.out.println("�� ���� �N�ϴ�.");
	}
	
}
