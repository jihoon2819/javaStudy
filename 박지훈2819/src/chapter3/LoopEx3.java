package chapter3;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {

		// 모든프로그램은 무한루프안에서 작동한다.
		Scanner input= new Scanner(System.in);
		//키보드의 입력을 받을수있게 도와주는것
		
		boolean mLoop=true;
		//마스터루프를 제어하기위한 제어장치
		String selecter = null;
		//selecter 변수에 비어있는 값을 저장
		
		while(mLoop) {//무한반복(무한루프)
			System.out.println("1. 하위항목으로 이동");
			System.out.println("q. 프로그램종료");
			System.out.print("명령을 선택해 주세요: ");
			selecter=input.nextLine();
			//문자열 입력을 받아서 selecter에 저장
			//selecter.equals는 문자열이 서로같은지 비교 같으면 true 다르면 false를 출력한다.
			if(selecter.equals("q")) {
				break;//if는원래 자체의 break가있다 여기의 프레이크는 while 의 브레이크이다.
		}
			else if(selecter.equals("1")) {//비벼보기 ==안된다.
				while(true) {
				System.out.println("1. 하위항목 그대로유지");
				System.out.println("b. 뒤로가기");
				System.out.println("q. 프로그램 종료");
				System.out.println("명령을 선택해주세요");
				selecter = input.nextLine();
				
				if(selecter.equals("1")){
					System.out.println("하위항목에서 그대로 유지랍니다");
				}else if(selecter.equals("b")){
					break;
				}else if(selecter.equals("q")){
					mLoop=false;
					break;
				}else {
					System.out.print("1또는 q만 입력이 가능합니다.");
				}
			}
		}	else {
				System.out.print("1또는 q만 입력이 가능합니다.");
			}
		
	

	}
		System.out.println("프로그램이 종료되었습니다.");

	}
}

