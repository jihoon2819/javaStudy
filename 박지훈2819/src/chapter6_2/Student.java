package chapter6_2;

/**
 * 
 * 캡슐화
 * 정보은닉에 사용된다.
 * 데이터를 메소드들로 보호한다.
 *
 * 접근 지정자
 *
 * 해당클래스의 접슨을 어디까지, 어느영역 까지 허용할것인가.
 *		 	디폴트 ,		public ,		private ,		protected
 * 동일 클래스	O			O				O				O
 * 동일 패키지	O			O				X				O
 * 상속		X			O				X				O
 * 다른 패키지	X			O				X				X
 * 
 * getter/ setter
 * get : 가져오다.
 * set : 설정하다. 값을 대입하다.
 * 
 */

public class Student {
	// 앞에 안붙은 상태가 디폴트 상태 예시 String student_type
	private String student_type;//초등학생 중학생 고등학생 대학생
	private int student_code;//학번(학생의 고유 코드)
	private String student_name;//학생 이름
	private int student_year;//학년
	private int student_score;//성적 0~100점(평점)
	private int money;
	
	// 이예제에서의 
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
		System.out.println(student_name+"학생의 남은 용돈은"+money+"입니다.");
	}
}
