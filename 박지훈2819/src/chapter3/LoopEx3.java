package chapter3;

import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {

		// ������α׷��� ���ѷ����ȿ��� �۵��Ѵ�.
		Scanner input= new Scanner(System.in);
		//Ű������ �Է��� �������ְ� �����ִ°�
		
		boolean mLoop=true;
		//�����ͷ����� �����ϱ����� ������ġ
		String selecter = null;
		//selecter ������ ����ִ� ���� ����
		
		while(mLoop) {//���ѹݺ�(���ѷ���)
			System.out.println("1. �����׸����� �̵�");
			System.out.println("q. ���α׷�����");
			System.out.print("����� ������ �ּ���: ");
			selecter=input.nextLine();
			//���ڿ� �Է��� �޾Ƽ� selecter�� ����
			//selecter.equals�� ���ڿ��� ���ΰ����� �� ������ true �ٸ��� false�� ����Ѵ�.
			if(selecter.equals("q")) {
				break;//if�¿��� ��ü�� break���ִ� ������ ������ũ�� while �� �극��ũ�̴�.
		}
			else if(selecter.equals("1")) {//�񺭺��� ==�ȵȴ�.
				while(true) {
				System.out.println("1. �����׸� �״������");
				System.out.println("b. �ڷΰ���");
				System.out.println("q. ���α׷� ����");
				System.out.println("����� �������ּ���");
				selecter = input.nextLine();
				
				if(selecter.equals("1")){
					System.out.println("�����׸񿡼� �״�� �������ϴ�");
				}else if(selecter.equals("b")){
					break;
				}else if(selecter.equals("q")){
					mLoop=false;
					break;
				}else {
					System.out.print("1�Ǵ� q�� �Է��� �����մϴ�.");
				}
			}
		}	else {
				System.out.print("1�Ǵ� q�� �Է��� �����մϴ�.");
			}
		
	

	}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}
}

