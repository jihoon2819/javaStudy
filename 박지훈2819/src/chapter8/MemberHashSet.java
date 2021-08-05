package chapter8;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet=new HashSet<Member>();
	}
	public void addMember(Member m) {
		hashSet.add(m);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member m = ir.next();
			if(m.getMemberId()==memberId) {
				System.out.println();
				System.out.println(hashSet.remove(m));
				System.out.println();
				hashSet.remove(m);

				return true;
			}
		}
		System.out.println(memberId+"가 hashSet에 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	
	public boolean modifyMember(int memberId,String modifyName) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member m = ir.next();
			if(m.getMemberId()==memberId) {
				String preName = m.getMemberName();
				System.out.println(preName);
				System.out.println();
				m.setMemberName(modifyName);				
				System.out.println("변경된 아이디는"+modifyName);
				
				return true;			
				
				
				/*System.out.println();
				System.out.println("삭제된 아이디는"+m.getMemberName());
				System.out.println();
				m.setMemberName(modifyName);				
				System.out.println("변경된 아이디는"+modifyName);
				
				return true;*/
			}
		}
		System.out.println(memberId+"가 hashSet에 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	public void showAllMember() {
		for(Member m : hashSet) {
			System.out.println(m);
		}
		System.out.println();
	}
	
}
