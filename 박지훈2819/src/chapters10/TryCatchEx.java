package chapters10;

/**
 * 
 * ����ó��(Exception)
 * 
 *
 */


public class TryCatchEx {
	
	public void arrTest()throws ArrayIndexOutOfBoundsException{
		int[] arr = new int[5];
		
		for(int i =0 ; i <=5 ; i++) {
			arr[i]=i;
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		TryCatchEx tc = new TryCatchEx();
		
		
		try {
			tc.arrTest();
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�迭�� ũ�Ⱑ �ִ� 5�Դϴ� 5���� �̻��� �����ʹ� �߰� �� �� �����ϴ�");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("���ܰ� �߻��Ͽ����ϴ� �����ڵ带 �����Ͽ� �����ڿ��� ���� �ϼ���.");
		}finally	{
			System.out.println("�ڷ� ����");
		}
		
		

	}

}
