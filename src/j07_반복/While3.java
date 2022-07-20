package j07_반복;


import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * 반복횟수 입력: 10
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * i = 8
		 * i = 9
		 * i = 10
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * i = 8
		 * i = 9
		 * i = 10
		 */
		int n = 0;
		
		System.out.println("반복 횟수 입력: ");
		
		int i = 0;
		
		while(i < n) {
			System.out.println("i = " + (n + 1));
			i++;
		}
		
		i = 0;
		
		while(i < n);
			System.out.println("i = " + (n - 1));
			i++;
	}
}
