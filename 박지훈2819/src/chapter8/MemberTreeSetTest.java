package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		treeSet.addMember(new Member("������1"));
		treeSet.addMember(new Member("������2"));
		treeSet.addMember(new Member("������3"));
		treeSet.addMember(new Member("������4"));
		treeSet.addMember(new Member("������5"));
		treeSet.addMember(new Member("������6"));
		treeSet.addMember(new Member("������7"));
		treeSet.addMember(new Member("������8"));
		treeSet.addMember(new Member("������9"));
		treeSet.addMember(new Member("������0"));
		
		treeSet.showAllMember();
		
		treeSet.removeMember(20210004);
		
		treeSet.showAllMember();
				
		
	}

}
