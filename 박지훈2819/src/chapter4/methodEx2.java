package chapter4;

public class methodEx2 {
	//메소드는 클래스안에 정의 해야한다 메소드안에 메소드 정의 할수없다.
	
	//void란?
	//아무것도 존재하지않는다 공허하다 비어있다.
	//만약 여기서 보이드가 인트로바뀌면 줄께있다 인트값
	
	//반환값과 매개변수가 없는 메소드
	void carc() {
		System.out.println("반환값과 매개 변수가 없는 메소드입니다.");
	}
	
	//반환값이 없는 메소드
	void carc2(int 월급,double 세율) {
		int 세후월급;
		if(월급==0) {
			return;//메소들 빠져나오는 예 methodEx1참고
		}
		세후월급 =월급 - (int)(월급 * 세율) ;
		System.out.println("당신의 세후월급은 "+세후월급+"원입니다");
	}
	//매개변수가 없는 메소드

	String cars3() {
		int x = 0;
		int y = 0;
		String xy;
		xy = "("+ x +","+ y +")축";
		return xy;
	}
	
	//매개변수와 반환값이 둘다있는 메소드
	int cars4(int 월급,double 세율) {	//월급이 int라서 메소드 선언을 int로 해주어야한다
		int 세후월급;
		세후월급 =월급 - (int)(월급 * 세율) ;
		return 세후월급;
	}
	
	
	public static void main(String[] args) {
		methodEx2 me2=new methodEx2();
		me2.carc();//메소드 (함수)를 호출한다. 콜한다.
		me2.carc2(5000000, 0.1);
		String xtTest= me2.cars3();
		System.out.println(xtTest);
		System.out.println("당신의 세후월급은 "+me2.cars4(5000000,0.1)+"입니다.");
	}

}
