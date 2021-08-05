package chapter2;

public class stringEx {

	public static void main(String[] args) {
		boolean trueFalse = true;
		char munja = '문' ;
		int number = 1000;
		double d_number = 3.14;
		String str = "안녕하세요 반갑습니다";
				System.out.println(str);
				

				String name;		//박지훈
				String add;     	//부산 사하구
				String maleFemale;	//남자
				String phoneNumber; //010-5435-2819
				
				/** 
				 * 이름 :박지훈
				 * 주소 :부산 사하구
				 * 성 : 남자
				 * 연락처 :010-5435-2819
				 */
				 name = "박지훈";
				 add = "부산 사하구";
				 maleFemale = "남자";
				 phoneNumber = "010-5435-2819"; // 앞에 선언했기 때문에 앞에 string선언을 다시 
				                                // 하면 안된다.
				System.out.println("이름 : "+name);
				System.out.println("주소 : "+add);
				System.out.println("성 : "+maleFemale);
				System.out.println("연락처 : "+phoneNumber);
	}

}
