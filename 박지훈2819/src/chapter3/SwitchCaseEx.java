package chapter3;

public class SwitchCaseEx {

	public static void main(String[] args) {
		 int 라운드 = 8;
		 char 라운드2 = '일';
		 boolean 죽음=false;
		 
		 switch(라운드) {
		 	case 1:
		 		if(죽음==true) {
		 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
		 			라운드=1;
		 			break;//죽으면 처음부터 다시 깨야하기 때문에
		 		}
		 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
		 		라운드++;
		 	case 2:
		 		죽음=true;
		 		if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;//기억하자 브레이크
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 3:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 4:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 5:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 6:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 7:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		라운드++;
		 	case 8:if(죽음==true) {
	 			System.out.println(라운드+"라운드 게임에서 패배하셨습니다.");
	 			라운드=1;
	 			break;
	 		}
	 		System.out.println(라운드+"라운드 게임에서 승리하셨습니다.");
	 		
		 	case '일':
		 	default:
		 }
		 System.out.println("게임 종료");
	}

}
