package chapter4;

public class methodEx2 {
	//�޼ҵ�� Ŭ�����ȿ� ���� �ؾ��Ѵ� �޼ҵ�ȿ� �޼ҵ� ���� �Ҽ�����.
	
	//void��?
	//�ƹ��͵� ���������ʴ´� �����ϴ� ����ִ�.
	//���� ���⼭ ���̵尡 ��Ʈ�ιٲ�� �ٲ��ִ� ��Ʈ��
	
	//��ȯ���� �Ű������� ���� �޼ҵ�
	void carc() {
		System.out.println("��ȯ���� �Ű� ������ ���� �޼ҵ��Դϴ�.");
	}
	
	//��ȯ���� ���� �޼ҵ�
	void carc2(int ����,double ����) {
		int ���Ŀ���;
		if(����==0) {
			return;//�޼ҵ� ���������� �� methodEx1����
		}
		���Ŀ��� =���� - (int)(���� * ����) ;
		System.out.println("����� ���Ŀ����� "+���Ŀ���+"���Դϴ�");
	}
	//�Ű������� ���� �޼ҵ�

	String cars3() {
		int x = 0;
		int y = 0;
		String xy;
		xy = "("+ x +","+ y +")��";
		return xy;
	}
	
	//�Ű������� ��ȯ���� �Ѵ��ִ� �޼ҵ�
	int cars4(int ����,double ����) {	//������ int�� �޼ҵ� ������ int�� ���־���Ѵ�
		int ���Ŀ���;
		���Ŀ��� =���� - (int)(���� * ����) ;
		return ���Ŀ���;
	}
	
	
	public static void main(String[] args) {
		methodEx2 me2=new methodEx2();
		me2.carc();//�޼ҵ� (�Լ�)�� ȣ���Ѵ�. ���Ѵ�.
		me2.carc2(5000000, 0.1);
		String xtTest= me2.cars3();
		System.out.println(xtTest);
		System.out.println("����� ���Ŀ����� "+me2.cars4(5000000,0.1)+"�Դϴ�.");
	}

}
