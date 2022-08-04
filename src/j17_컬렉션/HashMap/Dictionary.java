package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {

		Map<String, String> dict = new HashMap<String, String>();
		
		Scanner scanner = new Scanner(System.in);
		
		String searchText = null;
		
		while(true) {
			System.out.println("[사전 검색 기능]");
			System.out.println("# 프로그램 종료 명령(exit)");
		
			System.out.println("검색어: ");
			searchText = scanner.nextLine();
			
			if(searchText.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(searchText.equals("축구")) {
				System.out.println("축구 -> soccer");
				
			}else if(searchText.equals("야구")) {
				System.out.println("야구 -> baseball");
				
			}else if(searchText.equals("농구")) {
				System.out.println("농구 -> basketball");
				
			}else if(searchText.equals("골프")){
				System.out.println("골프 -> golf");
				
			}else {
				System.out.println("여기에 없는 단어입니다");
			}
			System.out.println();
		
		}
		
		/*
		 * 축구 -> soccer
		 * 야구 -> baseball
		 * 농구 -> basketball
		 * 골프 -> golf
		 */

	}

}
