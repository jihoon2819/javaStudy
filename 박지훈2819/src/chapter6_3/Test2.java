package chapter6_3;

public class Test2 extends Test1 {
	
	public Test2() {
		super("자식1");//가 생략되어있다.// 부모의 생성자를 호출//슈퍼라는 생성자는 무조건 제일 위에 있어야 한다.
		System.out.println("자식 1클래스");
	}

	// 에노테이션
	@Override
	public void add() {
		System.out.println("세수를 더합니다.");// 자식에서 재정의 하는것을 오버라이딩이라고 한다 .
	}
	 
	public void sub() {
		System.out.println("세 수를 뻅니다.");
	}
	
}
