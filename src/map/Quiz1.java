package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz1 {

	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<>();
		
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		System.out.println(map.get('b'));
		
		map.replace('b', "블루베리");
		map.remove('a');
		
		Set<Character> keyset = map.keySet();
		for (char key : keyset) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
