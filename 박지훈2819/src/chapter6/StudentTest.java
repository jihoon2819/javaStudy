package chapter6;

public class StudentTest {

	public static void main(String[] args) {
		// kim,pack,lee,song 4명의 인스턴스를 생성.
		Student kim =new Student("대학생",20210702,"김기태",4,89);//대학생,20210702,김기태,4,89
		Student pack =new Student("고등생",20210703,"박강민",3,85);//고등생,20210703,박강민,3,85
		Student lee =new Student("중등생",20210704,"이주엽",2,90);//중등생,20210704,이주엽,2,90
		Student song =new Student("초등생",20210705,"송지효",6,95);//초등생,20210705,송지효,6,95
		Student ham=new Student();
		
		kim.student_info();
		pack.student_info();
		lee.student_info();
		song.student_info();
		ham.student_info(); 
		
		
		// 같은 의미
		/*kim.student_type="대학생";
		pack.student_type="고등생";
		lee.student_type="중등생";
		song.student_type="초등생";
		 
		pack.student_code=20210703;
		lee.student_code=20210704;
		song.student_code=20210705;
		
		kim.student_name="김기태";
		pack.student_name="박강민";
		lee.student_name="이주엽";
		song.student_name="송지효";
		
		kim.student_year=4;
		pack.student_year=2;
		lee.student_year=3;
		song.student_year=6;
		
		kim.student_score=89;
		pack.student_score=85;
		lee.student_score=90;
		song.student_score=95;*/
		
		
		
		
	}

}
