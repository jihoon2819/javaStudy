package chapter3;

import java.util.Scanner;

public class LoopEx2 {

	public static void main(String[] args) {
		// ������α׷��� ���ѷ����ȿ��� �۵��Ѵ�.
		Scanner input= new Scanner(System.in);
		//Ű������ �Է��� �������ְ� �����ִ°�
		
		boolean mLoop=true;
		//�����ͷ����� �����ϱ����� ������ġ
		String selecter = null;
		//selecter ������ ����ִ� ���� ����
		
		while(true) {//���ѹݺ�(���ѷ���)
			System.out.print("���α׷��� �����Ͻðڽ��ϱ�?(y/n)");
			selecter=input.nextLine();
			//���ڿ� �Է��� �޾Ƽ� selecter�� ����
			//selecter.equals�� ���ڿ��� ���ΰ����� �� ������ true �ٸ��� false�� ����Ѵ�.
			if(selecter.equals("y")) {
				break;//if�¿��� ��ü�� break���ִ� ������ ������ũ�� while �� �극��ũ�̴�.
		}
			else if(selecter.equals("n")) {
				System.out.print("���α׷��� ��� ����");
			}
			else {
				System.out.print("y�Ǵ� n�� �Է��� �����մϴ�.");
			}
		}
	System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
			
	


