package chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		treeSet.addMember(new Member("¹ÚÁöÈÆ1"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ2"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ3"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ4"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ5"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ6"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ7"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ8"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ9"));
		treeSet.addMember(new Member("¹ÚÁöÈÆ0"));
		
		treeSet.showAllMember();
		
		treeSet.removeMember(20210004);
		
		treeSet.showAllMember();
				
		
	}

}
