package chapter3;

public class ForEx1 {

	public static void main(String[] args) {
		int sum =0;
		int sum2=0;
		
		for(int i = 0; i < 10; i++) {
			sum=i+2;
			sum2=i+4;
			System.out.println(" sum: "+sum+" sum2: "+sum2);
		}//for문안에 쓴 int i는 for문안에서 만 사용할수있다 ('포문(for)'의 자식)
	for(int i=0;i<5;i++){
		for(int j=0;j<=i;j++) {
			System.out.print("*");// 이해해보기 포안의 포별찍ㄷ기
		}
		System.out.println();//줄을 넘겨주는 듯한 의미
	}//for문안에서 계속반복되어서 이런형태의 답이 나온다. i<10 열번 반복이구나라는것을 알수있음 /
	}
}