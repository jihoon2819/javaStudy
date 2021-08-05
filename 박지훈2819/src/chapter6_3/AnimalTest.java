package chapter6_3;

abstract class Animal{
	public abstract void move();// ��� �߻�ȭ�� ������� �Ѵ� abstract
}

class Human extends Animal{
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�");
	}
	
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
}

class Tiger extends Animal{
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
	@Override
	public void move() {
		 System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	
}

class Eagle extends Animal{
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���� ���ϴ�.");
	}
	@Override
	public void move() {
		System.out.println("�������� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	Animal[] list=new Animal[5];
	// ��� ȣ���� �������� ������ ��� �ް��ֱ⋚���� animal�ż��忡 ������ �ִ�.
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
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		
		test.addAnimal();
		System.out.println(".��ĳ����");
		System.out.println();
		test.casting();
		System.out.println("�ٿ� ĳ����");
		System.out.println("�ڹٴ� 1��1 ��� �� �����ϴ�");
	}

}
