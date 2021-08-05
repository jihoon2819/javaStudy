package chapter5;

public class arrayEx4 {
		/**
		 * 
		 * 2차원 배열
		 * 인덱스가 [][] 두개인 경우
		 * 
		 * 3차원 배열 부터는 다차원 배열이라고 부른다
		 */
	public static void main(String[] args) {
		String [][] 반번호 =new String[4][3];
		String [][][] 학년반번호 =new String[3][4][3];
		System.out.println("학년은 총 " + 학년반번호.length);
		System.out.println("반은 총 " + 학년반번호[0].length);
		System.out.println("번호은 총 " + 학년반번호[0][0].length);// 앞에 0넣는 이유 기억하기
		
		반번호[0][0]="박지훈0";
		반번호[0][1]="박지훈1";
		반번호[0][2]="박지훈2";
		
		반번호[1][0]="박지훈3";
		반번호[1][1]="박지훈4";
		반번호[1][2]="박지훈5";
		
		반번호[2][0]="박지훈6";
		반번호[2][1]="박지훈7";
		반번호[2][2]="박지훈8";
		
		반번호[3][0]="박지훈9";
		반번호[3][1]="박지훈0";
		반번호[3][2]="박지훈10";
		
		for(int i =0;i< 반번호.length;i++) {
			System.out.println((i+1)+" 반");
			for(int j = 0;j<반번호[0].length;j++) {//0번인덱스에 3명 이있다는 사실을 이용한것이다.
				System.out.println((i+1)+" 반 "+(j+1)+" 번 "+반번호[i][j]);
			}
		}
	}

}
