package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sNum1;
		String sNum2;
		int sum;
		System.out.print("첫버내 숫자를 입려하세여 : ");
		sNum1 = input.nextLine();
		System.out.print("두번째 숫자를 입려하세여 : ");
		sNum2 = input.nextLine();
		sum=Integer.parseInt(sNum1)+Integer.parseInt(sNum2);
		System.out.println("두수의 합은 " + sum); //풀어보자
	}

}
