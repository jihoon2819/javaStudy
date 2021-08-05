package chapter3;

public class forEx3 {

	public static void main(String[] args) {
		
		for(int i = 2;i<20;i++) {
			System.out.println(i+'´Ü');
			for(int j=1;j<20;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
			System.out.println();
		}
	}
}