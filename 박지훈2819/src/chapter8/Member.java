package chapter8;

public class Member implements Comparable<Member> {
	private static int autoMemberId=20210000;
	private int memberId;
	private String memberName;
	
	public Member(String memberName) {
		this.memberId=autoMemberId++;
		this.memberName=memberName;
	}	
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		String msg=memberName+"ȸ������ ���̵�� " +memberId+"�Դϴ�.";
		return msg;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}@Override
	public boolean equals(Object obj) {
		
		return this.memberId==obj.hashCode();
		//return this.hashcode()==obj.hashCode();
	}
	@Override //Ʈ���� ���ذ� �ʼ�
	public int compareTo(Member m) {
		// TODO Auto-generated method stub
		return this.memberId-m.memberId;
	}
	
	
}
