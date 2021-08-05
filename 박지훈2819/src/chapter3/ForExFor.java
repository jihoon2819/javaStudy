package chapter3;

public class ForExFor {

	public static void main(String[] args) {
		// 반복문
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		String[] str= {"a","c","x"};
		char[] ch = {'1','c','v'};
		
		int[] num2 = new int[10]; //인덱스 만적은 경우 값을 채우는게아닌 공간을 만드는개념
		
		for(int i = 0; i < 10;i++) {//for(;true;)//while에 true를 넣은것처럼 무한반복을 하겠다.
				System.out.println(i);					
		}
		for(int i = 0; i < num2.length;i++) {
			System.out.println(num2[i]);
		}
		
		num2[0]=100;
		num2[1]=200;
		for(int i = 0; i<num2.length;i++) {
			num2[i]=100+(i*100);
			System.out.println(num2[i]);
		}
		for(int i = 0; i < num2.length;i++) {
			System.out.println(num2[i]);
		}
		
	}

}
