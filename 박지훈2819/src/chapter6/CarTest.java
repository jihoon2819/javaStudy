package chapter6;

public class CarTest {

	public static void main(String[] args) {
		Car[] 차고 = new Car[5];// 클래스의 배열 1번쨰 차 2번쨰차  //배열 만들때 [] 표시 까먹지 않기
		String[] 책꽂이 = new String[10];
		
		Car 테슬라3 = new Car();
		테슬라3.제조사="테슬라";
		테슬라3.모델명="테슬라3";
		테슬라3.색상="블랙";
		
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		테슬라3.speedUp();// 메소드 호출
		
		테슬라3.info();
		
		Car 그랜저 = new Car();
		그랜저.제조사="현대지동차";
		그랜저.모델명="IG";
		그랜저.색상="화이트";
		
		그랜저.speedDown();// .차량정지가 먼저나온이유는 특별한이유가 아니라 호출순서이다.
		그랜저.info();
	}

}
