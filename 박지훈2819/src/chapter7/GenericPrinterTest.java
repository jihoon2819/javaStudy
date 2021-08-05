package chapter7;

public class GenericPrinterTest {

	public static void main(String[] args) {
		ThreeDPrinter<Powder> printerP = new ThreeDPrinter<Powder>();
		ThreeDPrinter<Plastic> printerPt = new ThreeDPrinter<Plastic>();
		
		Powder temp= new Powder();
		
		printerP.setMaterial(temp);
		Powder P= printerP.getMaterial(); // 다운캐스팅 해야함 오브젝트형태로 업캐스팅 되있는 상태가 되므로 get으로 가져오면
		System.out.println(P.toString());
		
		printerPt.setMaterial(new Plastic());
		Powder Pt= printerP.getMaterial(); // 다운캐스팅 해야함 오브젝트형태로 업캐스팅 되있는 상태가 되므로 get으로 가져오면
		System.out.println(Pt.toString());
	}

}
