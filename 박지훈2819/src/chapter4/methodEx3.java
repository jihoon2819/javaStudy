package chapter4;

import java.util.Scanner;

public class methodEx3 {
	
	Scanner input = new Scanner(System.in);
	
	String mainDisplay() {
		System.out.println("1, 더하기");
		System.out.println("2, 빼기");
		System.out.println("3, 곱하기");
		System.out.println("4, 나누기");
		System.out.println("q, 프로그램 종료");
		System.out.print("명령을 선택해주세요: ");
		return input.nextLine();
	}
	
	double calc(String selecter,double num1,double num2) {
		double result=0;
		if(selecter.equals("1")) {
		//더하기
		result=num1+num2;
	}else if(selecter.equals("2")) {
		//빼기
		result=num1-num2;
	}else if(selecter.equals("3")) {
		//곱사기
		result=num1*num2;
	}else if(selecter.equals("4")) {
		
		//나누기
		if(num2==0) {
			result=0;
		}else {
			result=num1/num2;
		}
		
	}return result;
		
	}
	
	public static void main(String[] args) {
		methodEx3 me3 = new methodEx3();//사용자 메소드의 접근을 위한 것
		
		String selecter;
		// 문자열 selecter변수를 선언
		
		String input1,input2;
		double num1,num2;
		//무한 반복을 시작한다.
		while(true) {
			selecter=me3.mainDisplay();//위에서 입려된값을 리턴됨
			if(selecter.equals("q")) {
				break;
			}else if(selecter.equals("1")||selecter.equals("2")
					||selecter.equals("3")||selecter.equals("4")) {
				System.out.println("첫번째 숫자를 입력해주세요: ");
				input1=me3.input.nextLine();
				System.out.println("두번째 숫자를 입력해주세요: ");
				input2=me3.input.nextLine();
				
				num1=Double.parseDouble(input1);// 문자열을 실수(소수점 단위)로 변환 
				num2=Double.parseDouble(input2);
				
				System.out.println("계산결과: "+me3.calc(selecter, num1, num2));
				
			}else {
				System.out.println("<입력오류!>");
			}
			System.out.println();
						
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
