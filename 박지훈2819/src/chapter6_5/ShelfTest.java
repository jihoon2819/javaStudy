package chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfS= new BookShelf();//��ĳ������ ���� �����غ���
		shelfS.push("�ڹ����α׷���");
		shelfS.push("��ǰ �ں�");
		shelfS.push("�ڹ� ����");
		shelfS.push("doit jaca");
		shelfS.push("java");
		
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		
		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("�ڹ����α׷���");
		shelfQ.enQueue("��ǰ �ں�");
		shelfQ.enQueue("�ڹ� ����");
		shelfQ.enQueue("doit jaca");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
	}

}
