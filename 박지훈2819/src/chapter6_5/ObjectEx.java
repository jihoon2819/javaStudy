package chapter6_5;

public class ObjectEx{
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

@Override
public String toString() {
// TODO Auto-generated method stub
return super.toString();
}

	public static void main(String[] args) {
		ObjectEx ex = new ObjectEx();
		ObjectEx ex2 = new ObjectEx();
		ObjectEx ex3 = new ObjectEx();
		ObjectEx ex4 = new ObjectEx();
		
		//to string�� ������ �����ϴ�.
		System.out.println(ex);
		System.out.println(ex2);
		System.out.println(ex3.toString());
		System.out.println(ex4.toString());
		
		String str1 = "������";
		String str2 = "������";
		String str3 = new String("������");
		String str4 = new String("������");
		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1);
		System.out.println(str2.toString());
		System.out.println(str3.toString());
		System.out.println(str4.toString());

		
	}

}
