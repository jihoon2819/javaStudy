package chapter6;

public class CarTest2 {

	public static void main(String[] args) {
		Car �ڵ���1 = new Car("�׽���","S","black");//�Ű�����...
		Car �ڵ���2 = new Car("�����ڵ���","�Ÿ","white");
		Car �ڵ���3 = new Car();
		Car �ڵ���4 = new Car("����ڵ���","k8","red",280);
		
		�ڵ���1.info();
		System.out.println();
		�ڵ���2.info();
		System.out.println();
		�ڵ���3.info();
		System.out.println();
		�ڵ���4.info();
		System.out.println(�ڵ���4.maxSpeed+"KM/h");
	}

}
