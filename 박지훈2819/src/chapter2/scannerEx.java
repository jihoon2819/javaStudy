package chapter2;

import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		String name;
		Scanner input; // ctrl + shift + o
		input = new Scanner(System.in); //in= �ü��
		name = input.nextLine();
		input.nextLine();//
		System.out.println(input.nextLine());// �ܼ�â�� ���� ĥ������
		System.out.println(name); // �츮�� ���θ�
	}

}
