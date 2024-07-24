package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);

		System.out.println(map);
		
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		System.out.println(map);
		
		map.remove("영어");

		Set<String> keyset = map.keySet();
		for (String key : keyset) {
			System.out.println(key + ":" + map.get(key));
		}

		System.out.println("map의 크기:" + map.size());

	}

}
