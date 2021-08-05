package chapter6_3;

public class Test3 extends Test1 {

	public Test3() {
		super("자식2");//가 생략되어있다.// 부모의 생성자를 호출
		System.out.println("자식 2클래스");
	}
	@Override
	public void add() {
		System.out.println("네수를 더합니다.");
	}
	public void sub() {
		System.out.println("네 수를 뻅니다.");
	}
}
