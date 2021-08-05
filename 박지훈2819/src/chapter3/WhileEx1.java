package chapter3;

public class WhileEx1 {

	public static void main(String[] args) {
		int i=1;
		while(i <10) {
			if(i%2==0) {
				i++;
				continue;//밑의 친구들을 무시하고 다시 실행 홀수일때만 실행하는 프로그램이됨 한번 응용해서 만들어보기.
			}
			System.out.println("2 X " +i+" = "+(2*i));//변수선언 while위에서 //안에서 선언하지않는다.
													  //선언 while 조건식에는 조건만 들어간다.
			
			i++;
		}
		for (int j = 1; j < 10 ;j++) {
			System.out.println("2X" +j+"="+(2*j));// 두개다 같은 의미이다 .
		}
		
	}
	
}
