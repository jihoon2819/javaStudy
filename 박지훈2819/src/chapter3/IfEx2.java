package chapter3;

public class IfEx2 {

	public static void main(String[] args) {
		int 나이 =14;
		
		if(나이 >=14 && 나이 <= 16) {
			System.out.println("중학생");
		}else if(나이 >=17 && 나이 <= 19) {
				System.out.println("고등학생");
		}else if(나이 >=20 && 나이 <= 26) {
				System.out.println("대학생");
		}else {
				System.out.println("백수");
		}
	}
}//명령문이 실행될때만 세미콜론쓰기//0이아니라면 다 참으로 인식 


