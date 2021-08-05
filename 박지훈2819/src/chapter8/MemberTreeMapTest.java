package chapter8;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("������"));
		tm.addMember(new Member("������1"));
		tm.addMember(new Member("������2"));
		tm.addMember(new Member("������3"));
		tm.addMember(new Member("������4"));
		tm.addMember(new Member("������5"));
		
		tm.showAllMember();
		
		tm.removeMember(20210005);
		
		tm.showAllMember();
	}

}
