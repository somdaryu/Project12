package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		HashMap<String, Float> map = new HashMap<>();
		
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keyset = map.keySet();
		for(String key : keyset) {
			System.out.println("[과목명]:"+key);
		}
		
		Collection<Float> values = map.values();
		for(float value : values) {
			System.out.println("[점수]:"+value);
		}

	}

}
