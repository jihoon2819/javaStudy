package chapter7;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		Powder temp= new Powder();
		
		printerP.setMaterial(temp);
		Powder P= printerP.getMaterial(); // �ٿ�ĳ���� �ؾ��� ������Ʈ���·� ��ĳ���� ���ִ� ���°� �ǹǷ� get���� ��������
		System.out.println(P.toString());
		
		printerPt.setMaterial(new Plastic());
		Powder Pt= printerP.getMaterial(); // �ٿ�ĳ���� �ؾ��� ������Ʈ���·� ��ĳ���� ���ִ� ���°� �ǹǷ� get���� ��������
		System.out.println(Pt.toString());
	}

}
