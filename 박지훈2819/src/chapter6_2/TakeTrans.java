package chapter6_2;
// ���غ���
public class TakeTrans {

	public static void main(String[] args) {
		Student park = new Student("������",20000);
		Student kim = new Student("�ھ���",30000);
		
		Bus b1= new Bus("43�� 3175");
		Bus b2= new Bus("99�� 3485");
		
		Subway s1= new Subway("1ȣ��");
		Subway s2= new Subway("2ȣ��");
		
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
