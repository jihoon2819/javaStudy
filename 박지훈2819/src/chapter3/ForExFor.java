package chapter3;

public class ForExFor {

	public static void main(String[] args) {
		// �ݺ���
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		String[] str= {"a","c","x"};
		char[] ch = {'1','c','v'};
		
		int[] num2 = new int[10]; //�ε��� ������ ��� ���� ä��°Ծƴ� ������ ����°���
		
		for(int i = 0; i < 10;i++) {//for(;true;)//while�� true�� ������ó�� ���ѹݺ��� �ϰڴ�.
				System.out.println(i);					
		}
		for(int i = 0; i < num2.length;i++) {
			System.out.println(num2[i]);
		}
		
		num2[0]=100;
		num2[1]=200;
		for(int i = 0; i<num2.length;i++) {
			num2[i]=100+(i*100);
			System.out.println(num2[i]);
		}
		for(int i = 0; i < num2.length;i++) {
			System.out.println(num2[i]);
		}
		
	}

}
