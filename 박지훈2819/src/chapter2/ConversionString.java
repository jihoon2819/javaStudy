package chapter2;
/**
 * 
 * ���ڿ� ����ȯ
 * int(����) => Interger
 * double(�Ǽ�) => Double
 * boolean(��)=> Boolean
 * 
 * �ڷ���=>���ڿ� (toString) 
 * 
 * ���ڿ�=>�ڷ���(parse�ڷ���)
 *
 */
public class ConversionString {

	public static void main(String[] args) {
		int num = 10;
		int num2;
		String sNum ="20";
		String sNum2;
		
		num2 = Integer.parseInt(sNum); //.parse�� ġ�� int ã����
		sNum2 = Integer.toString(num);
		
		double dNum = 10.05;
		String dNum2 = Double.toHexString(dNum);
		double dNum3 = Double.parseDouble(dNum2);
		
		String a ="10";
		String b ="20";
		System.out.println(a+b);
		
	}

}
