package chapter6_4;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();
		// ��ǻ�ʹ� �߰� Ŭ�����̱� ������ ������ �Ұ��� �ϴ�
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook1();
		//��Ʈ�� 1 �� Ÿ���� �޼��尡 �ϼ����� �ʾұ⶧���� ������ �Ұ����ϴ�.
		Computer c4 = new Notebook2();
		
		Notebook1 n1 = new Notebook2();//��ĳ����
		//Desktop d1 = new Notebook2();// �����ٸ� Ŭ������ ��ĳ���� ���̴�.
		
		Computer[] c = new Computer[10];
		
		c[0]=c2;//Desktop Ŭ����
		c[1]=c4;//Notebook2 Ŭ����
		c[2]=n1;//Notebook1 Ŭ����
		
		for (int i = 0 ; i<c.length;i++) {
			if(c[i]==null) {
				continue;
			}
			c[i].display();
			c[i].typing();
			c[i].trunOn();
			c[i].trunOff();
			
		}
	}

}
