package chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("������"));
		list.addMember(new Member("������"));
		list.addMember(new Member("������"));
		list.addMember(new Member("������"));
		list.addMember(new Member("����"));
		list.addMember(new Member("��������"));
		list.addMember(new Member("��������"));
		list.addMember(new Member("����Ʈ��"));
		list.addMember(new Member("�����ϸ�"));
		list.addMember(new Member("������ũ"));
		
		list.showAllMember();
		
		System.out.println("������ ��� ����");
		list.removeMember(202100010);
		list.removeMember(20210000);
		
		System.out.println();
		
		list.showAllMember();
		
		list.modifyMember(20210004, "���ӽ�");
	}

}
