package chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet=new MemberHashSet();
		
		hashSet.addMember(new Member("������1"));
		hashSet.addMember(new Member("������2"));
		hashSet.addMember(new Member("������3"));
		hashSet.addMember(new Member("������4"));
		hashSet.addMember(new Member("������5"));
		hashSet.addMember(new Member("������6"));
		hashSet.addMember(new Member("������7"));
		hashSet.addMember(new Member("������8"));
		
		hashSet.showAllMember();
		
		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();
		
		hashSet.modifyMember(20210000, "������");
		
		System.out.println();
		
		hashSet.showAllMember();
	}

}
