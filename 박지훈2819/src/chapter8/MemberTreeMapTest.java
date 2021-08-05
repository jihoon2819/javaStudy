package chapter8;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("¹ÚÁöÈÆ"));
		tm.addMember(new Member("¹ÚÁöÈÆ1"));
		tm.addMember(new Member("¹ÚÁöÈÆ2"));
		tm.addMember(new Member("¹ÚÁöÈÆ3"));
		tm.addMember(new Member("¹ÚÁöÈÆ4"));
		tm.addMember(new Member("¹ÚÁöÈÆ5"));
		
		tm.showAllMember();
		
		tm.removeMember(20210005);
		
		tm.showAllMember();
	}

}
