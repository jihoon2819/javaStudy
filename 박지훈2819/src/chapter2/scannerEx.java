package chapter2;

import java.util.Scanner;

public class scannerEx {

	public static void main(String[] args) {
		String name;
		Scanner input; // ctrl + shift + o
		input = new Scanner(System.in); //in= 운영체제
		name = input.nextLine();
		input.nextLine();//
		System.out.println(input.nextLine());// 콘솔창에 엔터 칠때까지
		System.out.println(name); // 우리는 라인만
	}

}
