package chapter3;

public class ForEx2 {

	public static void main(String[] args) {
		//2*1=2
		//2*2=4
		//.....
		//2*9=10
		
		int sum;
		for(int i = 2;i<10;i++) {
			for(int j = 1;j<10;j++) {
				if(j%2==0) {
					continue;// ������Ű�� ������ �Ѿ�� ���� ����� ���������ʰ�. while ���� ���� ����ϱ�.
				}
				System.out.println(i+"X"+j+"="+(i*j));//���� ���� ����//for ���� ���ʺ��� ���ư��ٴ� ��� �����ϱ�
			}
		}
	}

}
