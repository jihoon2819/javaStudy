package chapter6_3;
/**
 * 
 * ���(extends)
 * �θ�� �ڽ��� ����
 * �޼��� �������̵�(�޼��� ������)
 * -> �θ��� ������ ������ �ڽ��� ���� �ʰ� �� ���� �������� ���� ��Ű�� ��
 * -> �θ��� �޼ҵ� ������ �״�� ��������ʰ� ���Ӱ� �����Ͽ� ����ϴ°�
 * this,super 
 * (this = �ڽ� )(super = �θ�)
 */
class Person{
	private String name;
	private String job;
	private String maleFemale;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMaleFemale() {
		return maleFemale;
	}

	public void setMaleFemale(String maleFemale) {
		this.maleFemale = maleFemale;
	}

	public Person() {
		
	}
	
	public Person(String name,String job,String maleFemale) {
		this.name=name;
		this.job=job;
		this.maleFemale=maleFemale;		
	}
	public void speak() {
		System.out.println(name+"���� ���� �մϴ�.");
	}
}

public class Students extends Person {//�л�
	private String students_type;
	private String schoolName;
	private int year;
	
	
	
	public String getStudents_type() {
		return students_type;
	}

	public void setStudents_type(String students_type) {
		this.students_type = students_type;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void studentsInfo() {
		System.out.println("<�л� ����>");
		System.out.println("�̸� : "+super.getName());
		System.out.println("���� : "+super.getJob());
		System.out.println("���� : "+super.getMaleFemale());
		System.out.println("�з±��� : "+students_type);
		System.out.println("�б��� : "+schoolName);
		System.out.println("�г� : "+year);

	}

	public static void main(String[] args) {
		Students s1= new Students();
		s1.setName("������");
		s1.setJob("�л�");
		s1.setMaleFemale("��");
		s1.setStudents_type("���б�");
		s1.setSchoolName("���ƴ�");
		s1.setYear(4);
		
		s1.studentsInfo();
		
	}

}
