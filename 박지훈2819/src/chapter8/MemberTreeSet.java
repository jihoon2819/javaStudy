package chapter8;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	TreeSet<Member>treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(); 
	
	}
	public void addMember(Member m) {
		treeSet.add(m);
	
	}
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member m = ir.next();
			if(m.getMemberId()==memberId) {
				System.out.println(m.getMemberName()+"���� ������ �����մϴ�.");
				System.out.println(m);
				System.out.println();
				treeSet.remove(m);
				return true;
			}
		}
		System.out.println(memberId+"�� ���������ʽ��ϴ�.");
		return false;
	}
	
	
	public void showAllMember() {
		for(Member m : treeSet) {
			
			System.out.println(m);
		}
		System.out.println();
	}
}
