package chapter1;

public class ConversionEx {
	// �ش��ٸ� �ּ� ó��
	/**
	 * *
	 * �ش�Ŭ���� �Ǵ� �޼ҵ��� ������ ��� �ּ�
	 */
	public static void main(String[] args) {
		int i_Num = 10;
		int i_Num2 = 20;
		
		double d_Num = 10.08;
	    double d_Num2 = 45.13;
		
		int i_Sum = (int)d_Num + (int)d_Num2;
		double d_Sum = i_Num + i_Num2;
		
		double d_Sum2= i_Sum;
		
		System.out.println(i_Sum);
		System.out.println(d_Sum);

	}

}
