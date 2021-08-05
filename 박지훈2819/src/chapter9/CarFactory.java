package chapter9;

/**
 * 
 * ������ ����
 * �̱��� ����
 * ��ü�� �����ϰ� �ϳ��� �����ؼ� �����ϴ� ���
 * �������� ���������ڰ� private�̴�.
 *
 */

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private Car c;
	private int serialNum=20210000;
	

	private CarFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Car createCar() {
		serialNum++;
		return new Car(serialNum);
	}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
}
