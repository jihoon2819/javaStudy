package chapter2;
/**
 * 
 *삼항연산자
 * 조건식이 참이면 : 콜론앞의 결과를 반환
 * 조거식이 거짓이면: 콜돈뒤의 결과를 반환
 */
public class operationEx3 {

	public static void main(String[] args) {
		char select = 'Y'; // 대소문자 확인
		boolean trueFalse = false;
		
		trueFalse = (select == 'y' ? true: false);
		System.out.println(trueFalse);
		System.out.println(select == 'y' ? true: false); // 조건식이 그대로 들어가도 같다.
		System.out.println(
				select == 'Y' ? "참이다": select == 'y' ? "참이다": "거짓이다");
		
		
		/**
		 * 예제
		 * score = 89;
		 * grade = 'F'
		 * 조건식 = socre == 0~59면 "F학점" 출력 socre == 60~69 "D학점" socre == 70~79 면 "C학점" 
		 * socre == 80~89"B학점" socre == 90~100"A학점"
		 * System.out.println("학점은 "+ grade + score);
		 * 
		 */
		
		int score = 89;
		char grade = 'F'; // "" 의 의미는 문자열
			grade = (score >= 0 && score <60) ? 'F' : 
				(score < 70)	? 'D' : 
					(score < 80) ? 'C' : 
						(score < 90) ? 'B' : 
							(score <= 100) ? 'A' : ' ';
			System.out.println("학점은 "+ grade + score);
			//grade = (score <= 59 ? grade=grade[5] : 
						//score <= 59 ? grade=grade[4]
								//score <= 69 ? grade=grade[3]
										//score <= 79 ? grade=grade[2]
												//score <= 89 ? grade=grade[1] ); 오답  --- 
			//String class
			
	}

}
