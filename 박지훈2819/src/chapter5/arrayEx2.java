package chapter5;

public class arrayEx2 {

	public static void main(String[] args) {
		String[] å���� = new String[10];
		String[] reverseå����=new String[10];
		String[] å����2=new String[10];
		å����[4] = "�ڹ��� ����";
		å����[6] = "�� ǰ �ڹ�";
		å����[7] = "Do it �ڹ����α׷��� �Թ�";
		å����[8] = "���α׷��� �Թ�";
		

		System.out.println(å����[0]);
		
		
		for(int i=0,j=å����.length-1;i<å����.length;i++,j--)
			reverseå����[j]=å����[i];
			

		for (int i = 0; i < å����.length; i++) {
			//������ ���� ��Ʋ�ȴ��� �˾ƺ��� ���� �ߴ����� i<å����.length
			if (å����[i] == null && reverseå����[i]==null) { //&&�Ѵ� ����ؾ� ���� ���� ||�ϳ��� ����ص� ����
				continue;
			}
			System.out.println(å����[i]);
			System.out.println(reverseå����[i]);
		}
		/*
		reverseå����[9]=å����[0];
		reverseå����[8]=å����[1];
		reverseå����[7]=å����[2];
		reverseå����[6]=å����[3];
		reverseå����[5]=å����[4];
		reverseå����[4]=å����[5];
		*/
		for(int i=0,k=å����.length-1;i<å����.length;i++,k--) {
			å����2[k]=å����[i];
		}

		for(int i=0;i<å����.length;i++) {
			if(å����[i]==null) {// å�� �ִ��� ������ �˾Ƴ��� ���� ���� null���� ����ִٸ� �������� �Ѿ�⶧���� 
							   // å�� ������ ���� �ݺ��Ѵٴ� �ǹ�
				continue;
			}
			for(int k = 0;k<å����2.length;k++) {
				if(å����2[k] != null) {
					continue;
				}
				å����2[k]=å����[i];
				break;
			} //�ε��� Ȯ���ϴ� ��� print(å����[i] +i)
		/*for(int i=0,k=å����.length-1;i<å����.length;i++) {
			if(å����[i]==null) {
				continue;
			}else {
				
			}
			
		}
	*/		
		
		
		
		
		for(int i=0,j=å����.length-1;i<å����.length;i++,j--) {
			if(å����[i]==null) {
				continue;
			}
			reverseå����[j]=å����[i];
			System.out.println(reverseå����[j]);
		}
	}
}
