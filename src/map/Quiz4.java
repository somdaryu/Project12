package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<>();
		Student member1 = new Student(1001, "둘리", 90, 80, 70);
		Student member2 = new Student(1002, "도우너", 55, 65, 75);
		Student member3 = new Student(1003, "또치", 80, 50, 50);

		map.put(1001, member1);
		map.put(1002, member2);
		map.put(1003, member3);

		Collection<Student> values = map.values();
		
		System.out.println("학생별 총점");
		for (Student value : values) {

			System.out.print(value.name +" 총점: " + (value.koreanScore + value.mathScore + value.englishScore)+" ");
			
			int scoreSum = value.koreanScore + value.mathScore + value.englishScore;
			System.out.println(scoreSum / 3);
			
		}
		System.out.println();
		System.out.println("과목별 총점");
		

		int koreanSum = 0;
		int mathSum = 0;
		int englishSum = 0;
		
		
		Set<Integer> keySet = map.keySet();
		for(Integer key : keySet) {
			Student student = map.get(key);
			koreanSum = koreanSum + student.koreanScore;
			mathSum = mathSum + student.mathScore;
			englishSum = englishSum + student.englishScore;
		}
		
		System.out.println("국어 총점:"+koreanSum);
		System.out.println("수학 총점:"+mathSum);
		System.out.println("영어 총점:"+englishSum);

	}

}

class Student {
	int stuNum;
	String name;
	int koreanScore;
	int mathScore;
	int englishScore;

	public Student(int stuNum, String name, int koreanScore, int mathScore, int englishScore) {
		super();
		this.stuNum = stuNum;
		this.name = name;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}

	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", koreanScore=" + koreanScore + ", mathScore="
				+ mathScore + ", englishScore=" + englishScore + "]";
	}

}
