package chapter6_2;
// 꼭해보기
public class TakeTrans {

	public static void main(String[] args) {
		Student park = new Student("박지훈",20000);
		Student kim = new Student("박애진",30000);
		
		Bus b1= new Bus("43다 3175");
		Bus b2= new Bus("99다 3485");
		
		Subway s1= new Subway("1호선");
		Subway s2= new Subway("2호선");
		
		park.takeBus(b1, 13000);
		kim.takeBus(b1, 13000);
		
		park.showInfo();
		kim.showInfo();
		
		b1.showInfo();
		
		kim.getoffBuss(b1);
		b1.showInfo();
		park.getoffBuss(b1);
		
		park.takeSubway(s1);
		kim.takeSubway(s2);
		
		park.showInfo();
		kim.showInfo();
		
		s1.showInfo();
		s2.showInfo();
	}

}
