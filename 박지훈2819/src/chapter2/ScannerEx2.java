package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sNum1;
		String sNum2;
		int sum;
		System.out.print("ù���� ���ڸ� �Է��ϼ��� : ");
		sNum1 = input.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		sNum2 = input.nextLine();
		sum=Integer.parseInt(sNum1)+Integer.parseInt(sNum2);
		System.out.println("�μ��� ���� " + sum); //Ǯ���
	}

}
