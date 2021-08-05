package chapter6_3;
/**
 * 
 * 상속(extends)
 * 부모와 자식의 관계
 * 메서드 오버라이딩(메서드 재정의)
 * -> 부모의 안좋은 버릇을 자식이 닮지 않고 더 좋은 방향으로 개선 시키는 것
 * -> 부모의 메소드 내용을 그대로 사용하지않고 새롭게 정의하여 사용하는것
 * this,super 
 * (this = 자식 )(super = 부모)
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
		System.out.println(name+"님이 말을 합니다.");
	}
}

public class Students extends Person {//학생
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
		System.out.println("<학생 정보>");
		System.out.println("이름 : "+super.getName());
		System.out.println("직업 : "+super.getJob());
		System.out.println("성별 : "+super.getMaleFemale());
		System.out.println("학력구분 : "+students_type);
		System.out.println("학교명 : "+schoolName);
		System.out.println("학년 : "+year);

	}

	public static void main(String[] args) {
		Students s1= new Students();
		s1.setName("박지훈");
		s1.setJob("학생");
		s1.setMaleFemale("남");
		s1.setStudents_type("대학교");
		s1.setSchoolName("동아대");
		s1.setYear(4);
		
		s1.studentsInfo();
		
	}

}
