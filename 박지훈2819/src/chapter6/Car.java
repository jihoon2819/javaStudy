package chapter6;

public class Car {
	String 모델명;
	String 제조사;
	String 색상;
	int maxSpeed=200;
	int minSpeed=0;
	int speed=0;
	
	//오버로딩 
	// 같은 이름의 메소드 또는 생성자를 매개변수에 따라서 다른 형태로 정의 할수 있는것.
	// 매개변수의 갯수와 종류에따라서 갈림
	// 매개변수의 형태와 갯수가 같은데 순서만 바꾼경우는 불가능 하다
	
	public Car() {
		
	}
	public Car(String 제조사,String 모델명,String 색상,int 최대속도) {
		 this.제조사=제조사;//this는 클래스안에서 나자신을 가르킨다
		 this.모델명=모델명;
		 this.색상=색상;
		 maxSpeed=최대속도;
		 speed=100;// 기본속도설정 가능;
	}
	
	//생성자
	public Car(String 제조사,String 모델명,String 색상) {
		 this.제조사=제조사;//this는 클래스안에서 나자신을 가르킨다
		 this.모델명=모델명;
		 this.색상=색상;
	}
	
	void speedUp() {
		if(speed<maxSpeed) {
			speed+=5;
		}else {
			System.out.println("더이상 속도를 올릴 수없습니다.");
		}
	}
	
	void speedDown() {
		if(minSpeed<speed) {
			speed-=5;
		}else {
			System.out.println("차량정지");
		}
	}
	
	void info() {
		System.out.println("제조사 명: "+제조사);
		System.out.println("모델명: "+모델명);
		System.out.println("색상: "+색상);
		if(speed<maxSpeed&&speed>minSpeed) {
			System.out.println("현재 속도는 시속 "+speed+"KM");
		}else {
			System.out.println("차량이 정지 상태입니다.");
		}
	}
}
