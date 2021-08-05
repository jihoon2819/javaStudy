package chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("±èÁØÀÏ"));
		list.addMember(new Member("±èÁÖÀÏ"));
		list.addMember(new Member("±èÁîÀÏ"));
		list.addMember(new Member("±èÁöÀÏ"));
		list.addMember(new Member("±èÀÏ"));
		list.addMember(new Member("±èÁöÁØÀÏ"));
		list.addMember(new Member("±èÁØÀÚÀÏ"));
		list.addMember(new Member("±èÁØÆ®ÀÏ"));
		list.addMember(new Member("±èÁØÀÏ¸®"));
		list.addMember(new Member("±èÁØÀÏÅ©"));
		
		list.showAllMember();
		
		System.out.println("»èÁ¦ÇÑ ¸â¹ö Á¤º¸");
		list.removeMember(202100010);
		list.removeMember(20210000);
		
		System.out.println();
		
		list.showAllMember();
		
		list.modifyMember(20210004, "ÀÓÀÓ½º");
	}

}
