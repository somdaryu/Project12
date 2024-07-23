package collection;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		//리스트 요소 하나씩 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		System.out.println("리스트 전체 요소: " + list); //toString이 재정의되어서 안에 주소값 말고 리스트 값이 나옴
		list.remove(2);
		System.out.println("리스트 삭제 후: "+list);
		
		int size = list.size();
		System.out.println("리스트 크기: "+ size);
	}

}
