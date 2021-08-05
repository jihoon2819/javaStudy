package chapter8;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<Member>();
	}
	public void addMember(Member m) {
		arrayList.add(m);
	}
	public boolean removeMember(int memberId) {
		for(int i = 0 ; i<arrayList.size();i++) {
			Member m =arrayList.get(i);
			if (m.getMemberId()==memberId) {
				System.out.println(arrayList.remove(i));
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	
	public boolean modifyMember(int memberId,String modifyMembername) {
		for(Member m : arrayList) {
			if(m.getMemberId()==memberId) {
				String prename =m.getMemberName();
				m.setMemberName(modifyMembername);
				System.out.println("수전된 "+m.getMemberId()+"멤버정보");
				System.out.println(prename+"->"+m.getMemberName());
				System.out.println();
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		System.out.println();
		return false;
	}
	
	public void showAllMember() {
		for(int i = 0 ;i < arrayList.size();i++) {
			Member m = arrayList.get(i);
			System.out.println(m);
		}
		System.out.println();
	}
	
}
