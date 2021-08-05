package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet=new MemberHashSet();
		
		hashSet.addMember(new Member("¹ÚÁöÈÆ1"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ2"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ3"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ4"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ5"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ6"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ7"));
		hashSet.addMember(new Member("¹ÚÁöÈÆ8"));
		
		hashSet.showAllMember();
		
		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210000, "¹ÚÁöÈÆ");
		
		System.out.println();
		
		hashSet.showAllMember();
	}

}
