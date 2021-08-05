package chapter6_2;

/**
 * 
 * ĸ��ȭ
 * �������п� ���ȴ�.
 * �����͸� �޼ҵ��� ��ȣ�Ѵ�.
 *
 * ���� ������
 *
 * �ش�Ŭ������ ������ ������, ������� ���� ����Ұ��ΰ�.
 *		 	����Ʈ ,		public ,		private ,		protected
 * ���� Ŭ����	O			O				O				O
 * ���� ��Ű��	O			O				X				O
 * ���		X			O				X				O
 * �ٸ� ��Ű��	X			O				X				X
 * 
 * getter/ setter
 * get : ��������.
 * set : �����ϴ�. ���� �����ϴ�.
 * 
 */

public class Student {
	// �տ� �Ⱥ��� ���°� ����Ʈ ���� ���� String student_type
	private String student_type;//�ʵ��л� ���л� ����л� ���л�
	private int student_code;//�й�(�л��� ���� �ڵ�)
	private String student_name;//�л� �̸�
	private int student_year;//�г�
	private int student_score;//���� 0~100��(����)
	private int money;
	
	// �̿��������� 
	public Student(String student_name,int money) {
		this.student_name=student_name;
		this.money=money;
		
	}
	public void takeBus(Bus bus, int money) {
		bus.take(money);
		this.money-=money;
		
	}
	public void getoffBuss(Bus bus) {
		bus.getoff();
		
	}
	public void takeSubway(Subway subway) {
		subway.take(1300);
		this.money-=1300;
		
	}
	public void getOffSubway(Subway subway) {
		subway.getoff();
		
	}
	public void showInfo() {
		System.out.println(student_name+"�л��� ���� �뵷��"+money+"�Դϴ�.");
	}
}
