package chapter6_3;

public class Test {
	
	/**
	 * 
	 * ������
	 * ���� ��ü�� ���� ���¸� ��ȭ��Ű�°�
	 * ��ĳ����,�ٿ�ĳ����
	 * 
	 * �ڽ� -> �θ� (��ĳ����)
	 * 
	 * �θ�->  �ڽ� (�ٿ�ĳ����)
	 * 
	 */

	public static void main(String[] args) {
		
	/*	new Test1("null");
		new Test2();
		new Test3();
		
		Test2 t2 = new Test2();//�ڽ�
		Test3 t3 = new Test3 ();//�ڽ�
		
		Test1 t1 = new Test1 ("null");// �θ�
		
		System.out.println();
		t2.add();
		t3.add();*/
		
		Test1 t1_1 =new Test2();// ��ĳ����// test2�� �����ϰԵǸ� new Test1()�� �����̴�
		
		Test1 t1_2 =new Test3();
		
		t1_1.add();
		t1_2.add();
		
		
		Test2 t2 =(Test2)t1_1;
		t2.sub();
	}

}
