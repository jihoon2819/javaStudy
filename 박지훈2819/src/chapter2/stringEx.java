package chapter2;

public class stringEx {

	public static void main(String[] args) {
		boolean trueFalse = true;
		char munja = '��' ;
		int number = 1000;
		double d_number = 3.14;
		String str = "�ȳ��ϼ��� �ݰ����ϴ�";
				System.out.println(str);
				

				String name;		//������
				String add;     	//�λ� ���ϱ�
				String maleFemale;	//����
				String phoneNumber; //010-5435-2819
				
				/** 
				 * �̸� :������
				 * �ּ� :�λ� ���ϱ�
				 * �� : ����
				 * ����ó :010-5435-2819
				 */
				 name = "������";
				 add = "�λ� ���ϱ�";
				 maleFemale = "����";
				 phoneNumber = "010-5435-2819"; // �տ� �����߱� ������ �տ� string������ �ٽ� 
				                                // �ϸ� �ȵȴ�.
				System.out.println("�̸� : "+name);
				System.out.println("�ּ� : "+add);
				System.out.println("�� : "+maleFemale);
				System.out.println("����ó : "+phoneNumber);
	}

}
