package chapter6_5;

/**
 * 
 * 인터페이스(interface)
 * 약속에 대한 정의를 하는것.
 * 상속이아니라 구현이라고 한다.( implement)
 * 상속은 다중상속이 불가능하지만 
 * 인터페이스 구현은 다중 구현이 가능하다.
 * 기본적으로 모든 메서드가 추상(abstract) 메서드이다.
 * 모든 변수가 static 상수이다.
 * class대신에 interface 사용
 * 
 *
 */

public interface Calc {
	//인터페이스에서는 static, final예약어를 생략할수 있다.
	
	final double PI=3.14;
	int ERROR=-999999999;
	
	
	 // abstract예약어를 생략할수 있다.
	int add(int num1,int num2);  //덧셈 
	int sub(int num1,int num2);	 //뺼셈
	int times(int num1,int num2);//곱셈
	int divide(int num1,int num2);//나눗셈
	
	//일반 메서드를 정의하고 싶을때
	default void description() { // 일반메서드를 사용하기위해서는 default 를 붙혀주어야 한다.
		System.out.println("정수 계산기를 구현합니다.");
	}
		
	/**
	 * 
	 * static(정적)
	 * 단 하나밖에 없다.
	 * 만들어진 하나를 여러곳에서 공유하여 사용하기 위해 static을 선언한다.
	 * static의 특징으로는 폰트가 이텔릭체로 변한다.(기울어짐)
	 * 
	 */
	static int total(int[] arr) {//static이 붙으면 abstract가 상소ㅐ 된다.
		int total =0;
		for(int i: arr) {
			total+=i;
		}
		return total;
	}
	
}
