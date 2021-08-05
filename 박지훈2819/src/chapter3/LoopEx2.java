package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// 모든프로그램은 무한루프안에서 작동한다.
		Scanner input= new Scanner(System.in);
		//키보드의 입력을 받을수있게 도와주는것
		
		boolean mLoop=true;
		//마스터루프를 제어하기위한 제어장치
		String selecter = null;
		//selecter 변수에 비어있는 값을 저장
		
		while(true) {//무한반복(무한루프)
			System.out.print("프로그램을 종료하시겠습니까?(y/n)");
			selecter=input.nextLine();
			//문자열 입력을 받아서 selecter에 저장
			//selecter.equals는 문자열이 서로같은지 비교 같으면 true 다르면 false를 출력한다.
			if(selecter.equals("y")) {
				break;//if는원래 자체의 break가있다 여기의 프레이크는 while 의 브레이크이다.
		}
			else if(selecter.equals("n")) {
				System.out.print("프로그램을 계속 진행");
			}
			else {
				System.out.print("y또는 n만 입력이 가능합니다.");
			}
		}
	System.out.println("프로그램이 종료되었습니다.");
	}
}
			
	


