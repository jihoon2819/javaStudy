package chapter6_3;

public class Test {
	
	/**
	 * 
	 * 다형성
	 * 상위 객체를 통해 형태를 변화시키는것
	 * 업캐스팅,다운캐스팅
	 * 
	 * 자식 -> 부모 (업캐스팅)
	 * 
	 * 부모->  자식 (다운캐스팅)
	 * 
	 */

	public static void main(String[] args) {
		
	/*	new Test1("null");
		new Test2();
		new Test3();
		
		Test2 t2 = new Test2();//자식
		Test3 t3 = new Test3 ();//자식
		
		Test1 t1 = new Test1 ("null");// 부모
		
		System.out.println();
		t2.add();
		t3.add();*/
		
		Test1 t1_1 =new Test2();// 업캐스팅// test2를 생성하게되면 new Test1()도 포함이다
		
		Test1 t1_2 =new Test3();
		
		t1_1.add();
		t1_2.add();
		
		
		Test2 t2 =(Test2)t1_1;
		t2.sub();
	}

}
