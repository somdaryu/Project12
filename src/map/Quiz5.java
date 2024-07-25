package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Quiz5 {

	public static void main(String[] args) {
		MemberHashMap memberhashmap = new MemberHashMap();
		Member member1 = new Member(1001, "또치");
		Member member2 = new Member(1002, "둘리");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");

		memberhashmap.addMember(member1);
		memberhashmap.addMember(member2);
		memberhashmap.addMember(member3);
		memberhashmap.addMember(member4);
		
		memberhashmap.showAllMember();
		
		System.out.println("MemberHashMap에 1004번 회원이 있으면 삭제하세요!");
		memberhashmap.removeMember(1004);
		memberhashmap.showAllMember();
	}
}


class MemberHashMap {
	HashMap<Integer, Member> map;
	
	//인스턴스 생성 + 초기화
	public MemberHashMap() {
		map = new HashMap<>(); //생성자에서 맵 먼저 생성해야함
	}
	
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	//아이디로 특정회원을 삭제하는 메소드
	public void removeMember(int memberId) {
		
//		Set<Integer> keySet = map.keySet();
//		
//		for(Integer key : keySet) {
//			Member member = map.get(key);
//			int id = member.memberId;
//			
//			if(id == memberId) {
//				map.remove(key);
//				System.out.println(memberId + "번 회원을 삭제하였습니다.");
//				return;
//			}
//			
//		}
//		
//		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		
		if(map.containsKey(memberId)) {
			map.remove(memberId);
			System.out.println(memberId + "번 회원을 삭제하였습니다");
			return;
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
	}
	
	public void showAllMember() {
		Collection<Member> values = map.values();
		for(Member value : values) {
			System.out.println(value);
		}
	}
	
}