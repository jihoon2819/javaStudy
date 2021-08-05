package chapter3;

public class LoopEx {

	public static void main(String[] args) {
		//반복문
		//for,while(do~while)
		for(int i = 0;i<100;i++) {
			if(i%2==0) {//i가 짝수이면 //for에서는 후처리로갔다가 조건 검색
				continue;
			}
			//반복적으로 실해될명령문1
			//반복적으로 실해될명령문2
			//반복적으로 실해될명령문3
			//반복적으로 실해될명령문4
		}
		int i = 0;
		while(i<100) {
			if(i%2==0) {//i가 짝수이면 
				i++;// 컨티뉴 위에다하는이유 컨디누는 아래방향으로 다무시한다.
				continue;
			}
			//반복적으로 실해될명령문1
			//반복적으로 실해될명령문2
			//반복적으로 실해될명령문3
			//반복적으로 실해될명령문4
			i++;
		}
	}

}
