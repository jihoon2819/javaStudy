package chapter4;

import java.util.Scanner;

public class methodEx3 {
	
	Scanner input = new Scanner(System.in);
	
	String mainDisplay() {
		System.out.println("1, ���ϱ�");
		System.out.println("2, ����");
		System.out.println("3, ���ϱ�");
		System.out.println("4, ������");
		System.out.println("q, ���α׷� ����");
		System.out.print("����� �������ּ���: ");
		return input.nextLine();
	}
	
	double calc(String selecter,double num1,double num2) {
		double result=0;
		if(selecter.equals("1")) {
		//���ϱ�
		result=num1+num2;
	}else if(selecter.equals("2")) {
		//����
		result=num1-num2;
	}else if(selecter.equals("3")) {
		//�����
		result=num1*num2;
	}else if(selecter.equals("4")) {
		
		//������
		if(num2==0) {
			result=0;
		}else {
			result=num1/num2;
		}
		
	}return result;
		
	}
	
	public static void main(String[] args) {
		methodEx3 me3 = new methodEx3();//����� �޼ҵ��� ������ ���� ��
		
		String selecter;
		// ���ڿ� selecter������ ����
		
		String input1,input2;
		double num1,num2;
		//���� �ݺ��� �����Ѵ�.
		while(true) {
			selecter=me3.mainDisplay();//������ �Է��Ȱ��� ���ϵ�
			if(selecter.equals("q")) {
				break;
			}else if(selecter.equals("1")||selecter.equals("2")
					||selecter.equals("3")||selecter.equals("4")) {
				System.out.println("ù��° ���ڸ� �Է����ּ���: ");
				input1=me3.input.nextLine();
				System.out.println("�ι�° ���ڸ� �Է����ּ���: ");
				input2=me3.input.nextLine();
				
				num1=Double.parseDouble(input1);// ���ڿ��� �Ǽ�(�Ҽ��� ����)�� ��ȯ 
				num2=Double.parseDouble(input2);
				
				System.out.println("�����: "+me3.calc(selecter, num1, num2));
				
			}else {
				System.out.println("<�Է¿���!>");
			}
			System.out.println();
						
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
