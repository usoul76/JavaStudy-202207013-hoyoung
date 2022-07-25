package j10_배열;

import j09_클래스.접근지정자.Student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * names 배열 5개
		 * studentYear 배열 5개
		 * scores 배열 5개
		 * 
		 * 박진환 3 75.9
		 * 조문기 2 80.5
		 * 서재효 4 85.7
		 * 임나영 3 88.3
		 * 전나경 4 78.5
		 * 
		 * 박진환 \t3학년 \t75.9
		 * 조문기 \t2학년 \t80.5
		 * 서재효 \t4학년 \t85.7
		 * 임나영 \t3학년 \t88.3
		 * 전나경 \t4학년 \t78.5
		 */
				
		String[] names = {"박진환", "조문기", "서재효", "임나영", "전나경"};
		int[] studentYear = {3, 2, 4, 3, 4};
		double[] scores = {75.9, 80.5, 85.7, 88.3, 78.5};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "\t" + studentYear[i] + "학년\t" + scores[i] + "점");
		}
		Student[] students = new Student[5];
		students[0] = new Student("김준일", 3, 29, "부산", "010-9988-1916");
		
		for(int i = 0; i < 5; i++) {
			if(students[i] != null) {
				System.out.println("이름: " + students[i].getName());
			}
		}
	}

}
