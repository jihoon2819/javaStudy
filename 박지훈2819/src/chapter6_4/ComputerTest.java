package chapter6_4;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();
		// 컴퓨터는 추가 클래스이기 떄문에 생성이 불가능 하다
		Computer c2 = new Desktop();
		//Computer c3 = new Notebook1();
		//노트북 1 은 타이핑 메서드가 완성되지 않았기때문에 생성이 불가능하다.
		Computer c4 = new Notebook2();
		
		Notebook1 n1 = new Notebook2();//업캐스팅
		//Desktop d1 = new Notebook2();// 전혀다른 클래스를 업캐스팅 중이다.
		
		Computer[] c = new Computer[10];
		
		c[0]=c2;//Desktop 클래스
		c[1]=c4;//Notebook2 클래스
		c[2]=n1;//Notebook1 클래스
		
		for (int i = 0 ; i<c.length;i++) {
			if(c[i]==null) {
				continue;
			}
			c[i].display();
			c[i].typing();
			c[i].trunOn();
			c[i].trunOff();
			
		}
	}

}
