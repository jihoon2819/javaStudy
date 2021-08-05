package chapter6_5;

public class ShelfTest {

	public static void main(String[] args) {
		Stack shelfS= new BookShelf();//업캐스팅인 이유 생각해보기
		shelfS.push("자바프로그래밍");
		shelfS.push("명품 자비");
		shelfS.push("자바 정석");
		shelfS.push("doit jaca");
		shelfS.push("java");
		
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		System.out.println(shelfS.getStackSize()+"~"+shelfS.pop());
		
		Queue shelfQ = new BookShelf();
		shelfQ.enQueue("자바프로그래밍");
		shelfQ.enQueue("명품 자비");
		shelfQ.enQueue("자바 정석");
		shelfQ.enQueue("doit jaca");
		shelfQ.enQueue("java");
		
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
		System.out.println(shelfQ.getQueueSize()+"~"+shelfQ.deQueue());
	}

}
