package chapter6_3;

abstract class Animal{
	public abstract void move();// 요게 추상화의 예약어라고 한다 abstract
}

class Human extends Animal{
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
}

class Tiger extends Animal{
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		 System.out.println("호랑이가 네발로 뜁니다.");
	}
	
}

class Eagle extends Animal{
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아 갑니다.");
	}
	@Override
	public void move() {
		System.out.println("독수리가 날아갑니다.");
	}
}

public class AnimalTest {
	Animal[] list=new Animal[5];
	// 사람 호랑이 독수리는 동물을 상속 받고있기떄문에 animal매서드에 넣을수 있다.
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle();

		for(int i = 0; i< list.length;i++) {
			if(list[i]==null) {
				continue;
			}
			list[i].move();
		}
	}
	
	public void casting() {
		for(int i = 0;i<list.length; i++) {
			if(list[i]==null) {
				continue;
			}
			Animal ani = list[i];
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		
		test.addAnimal();
		System.out.println(".업캐스팅");
		System.out.println();
		test.casting();
		System.out.println("다운 캐스팅");
		System.out.println("자바는 1대1 상속 만 가능하다");
	}

}
