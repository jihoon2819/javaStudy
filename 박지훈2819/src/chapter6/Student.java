package chapter6;

public class Student {
	String student_type;//�ʵ��л� ���л� ����л� ���л�
	int student_code;//�й�(�л��� ���� �ڵ�)
	String student_name;//�л� �̸�
	int student_year;//�г�
	int student_score;//���� 0~100��(����)
	
	public Student(String student_type,int student_code,String student_name,int student_year,int student_score) {
		this.student_type=student_type;
		this.student_code=student_code;
		this.student_name=student_name;
		this.student_year=student_year;
		this.student_score=student_score;
	}
	//public�� �����ڶ�� �θ�
	public Student() {
		student_type="�ʵ��л�";// ����Ʈ�� ����= �⺻�� ���� �� �ǹ��Ѵ�.
		student_code=0;
		student_name="�л���";
		student_year=1;
		student_score=0;
					
	}
	
	
	void student_info() {
		System.out.println("�л�����: "+student_type);
		System.out.println("�й�: "+student_code);
		System.out.println("�̸�: "+student_name);
		System.out.println("�г�: "+student_year);
		System.out.println("����: "+student_score);
	}
	
}
