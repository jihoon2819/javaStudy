package chapter2;

public class mais2 {

	public static void main(String[] args) {
		int gameScore = 150;
		
		System.out.println(gameScore);
		System.out.println(++gameScore); // 증가시키고 출력 무조건 1씩 
		System.out.println(gameScore++); // 이줄이 지나고 나서 증가
		System.out.println(gameScore++);
		System.out.println(gameScore);
		System.out.println(gameScore--);
		System.out.println(gameScore);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(gameScore++);
		System.out.println(++gameScore);
		System.out.println(--gameScore);
		int gamescore = gameScore *= 2;
		System.out.println(gamescore);
	}

}
