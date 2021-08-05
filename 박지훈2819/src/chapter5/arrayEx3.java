package chapter5;

public class arrayEx3 {

	public static void main(String[] args) {
		int[] num = {9,8,7,6,5,4,3,2,1,0};
		
		int[] reverseNum = new int[10];
		/*
		 * reverseNum[9]=num[0];
		 * reverseNum[8]=num[1];
		*reverseNum[7]=num[2];
		*reverseNum[6]=num[0];
		*reverseNum[5]=num[0];
		*reverseNum[4]=num[0];
		*reverseNum[3]=num[0];
		*reverseNum[2]=num[0];
		 */
		
		for(int i = 0,j=num.length-1;i<num.length;i++,j--) {//j--저거 기억하기 조건문 형태 기억하기 ,를 통한 여러가지 
															//선언 할수있다 
			reverseNum[j]=num[i];
		}
		for(int i =0;i<reverseNum.length;i++) {
			System.out.println(reverseNum[i]);
		}
	}

}
