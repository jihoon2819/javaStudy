package chapter6_4;

public class AbstractTest1 {

	public static void main(String[] args) {
		AbstractEx1 ae1 = new AbstractEx1C();//��ĳ����
		AbstractEx1C ae1c = new AbstractEx1C();
		AbstractEx1C ae1c2 = (AbstractEx1C)ae1;//�ٿ�ĳ����
	}

}
