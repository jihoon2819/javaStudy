package chapter3;

public class ForEx1 {

	public static void main(String[] args) {
		int sum =0;
		int sum2=0;
		
		for(int i = 0; i < 10; i++) {
			sum=i+2;
			sum2=i+4;
			System.out.println(" sum: "+sum+" sum2: "+sum2);
		}//for���ȿ� �� int i�� for���ȿ��� �� ����Ҽ��ִ� ('����(for)'�� �ڽ�)
	for(int i=0;i<5;i++){
		for(int j=0;j<=i;j++) {
			System.out.print("*");// �����غ��� ������ �����蠟��
		}
		System.out.println();//���� �Ѱ��ִ� ���� �ǹ�
	}//for���ȿ��� ��ӹݺ��Ǿ �̷������� ���� ���´�. i<10 ���� �ݺ��̱�����°��� �˼����� /
	}
}