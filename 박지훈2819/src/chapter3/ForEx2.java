package chapter3;

public class ForEx2 {

	public static void main(String[] args) {
		//2*1=2
		//2*2=4
		//.....
		//2*9=10
		
		int sum;
		for(int i = 2;i<10;i++) {
			for(int j = 1;j<10;j++) {
				if(j%2==0) {
					continue;// 증가시키는 쪽으로 넘어간다 밑의 명령은 실행하지않고. while 과의 차이 기억하기.
				}
				System.out.println(i+"X"+j+"="+(i*j));//무한 루프 조심//for 문의 안쪽부터 돌아간다는 사실 인지하기
			}
		}
	}

}
