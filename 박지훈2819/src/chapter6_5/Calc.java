package chapter6_5;

/**
 * 
 * �������̽�(interface)
 * ��ӿ� ���� ���Ǹ� �ϴ°�.
 * ����̾ƴ϶� �����̶�� �Ѵ�.( implement)
 * ����� ���߻���� �Ұ��������� 
 * �������̽� ������ ���� ������ �����ϴ�.
 * �⺻������ ��� �޼��尡 �߻�(abstract) �޼����̴�.
 * ��� ������ static ����̴�.
 * class��ſ� interface ���
 * 
 *
 */

public interface Calc {
	//�������̽������� static, final���� �����Ҽ� �ִ�.
	
	final double PI=3.14;
	int ERROR=-999999999;
	
	
	 // abstract���� �����Ҽ� �ִ�.
	int add(int num1,int num2);  //���� 
	int sub(int num1,int num2);	 //�E��
	int times(int num1,int num2);//����
	int divide(int num1,int num2);//������
	
	//�Ϲ� �޼��带 �����ϰ� ������
	default void description() { // �Ϲݸ޼��带 ����ϱ����ؼ��� default �� �����־�� �Ѵ�.
		System.out.println("���� ���⸦ �����մϴ�.");
	}
		
	/**
	 * 
	 * static(����)
	 * �� �ϳ��ۿ� ����.
	 * ������� �ϳ��� ���������� �����Ͽ� ����ϱ� ���� static�� �����Ѵ�.
	 * static�� Ư¡���δ� ��Ʈ�� ���ڸ�ü�� ���Ѵ�.(������)
	 * 
	 */
	static int total(int[] arr) {//static�� ������ abstract�� ��Ҥ� �ȴ�.
		int total =0;
		for(int i: arr) {
			total+=i;
		}
		return total;
	}
	
}
