package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i=1;
		while(i <10) {
			if(i%2==0) {
				i++;
				continue;//���� ģ������ �����ϰ� �ٽ� ���� Ȧ���϶��� �����ϴ� ���α׷��̵� �ѹ� �����ؼ� ������.
			}
			System.out.println("2 X " +i+" = "+(2*i));//�������� while������ //�ȿ��� ���������ʴ´�.
													  //���� while ���ǽĿ��� ���Ǹ� ����.
			
			i++;
		}
		for (int j = 1; j < 10 ;j++) {
			System.out.println("2X" +j+"="+(2*j));// �ΰ��� ���� �ǹ��̴� .
		}
		
	}
	
}
