package j09_클래스2.user;

import java.util.Scanner;

public class UserService {

	private Scanner scanner;
	private User[] userArray;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[사용자 등록 시스템]");
		System.out.println("1. 사용자 등록");
		System.out.println("2. 사용자 조회");
		System.out.println("e. 프로그램 종료");
		System.out.println("매뉴 선택 >>>");
		
		select = scanner.nextLine();
		if(select.equals("1")){
			User user = addUser();
			if(user != null) {
			System.out.println(user.toString());
			}
		}else if(select.equals("2")) {
			
		}else if(select.equals("e")) {
			System.out.println("프로그램 종료중...");
			return false;
		}else {
			System.out.println("해당 메뉴는 선택 할 수 없습니다");
			System.out.println("다시 입력하세요");
		}
		
		System.out.println();
		
		return true;
		
	}
	
	private User addUser() {
		for(int i = 0; i <userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser();
			System.out.println("[" +(userArray[i]).getUsername()+ "] 사용자 등록 완료");
			return userArray[i];
			
		}
		System.out.println("더 이상 사용자를 등록 할 수 없습니다");
		
		return null;
	}
	
	private User inputUser() {
		String username = null;
		String password = null;
		String name= null;;
		String email = null;
		
		System.out.println("[사용자 등록]");
		System.out.println("사용자 이름 >> ");
		username = scanner.nextLine();
		
		System.out.println("비밀번호 >> ");
		password = scanner.nextLine();
		
		System.out.println("이름 >> ");
		name = scanner.nextLine();
		
		System.out.println("이메일 >> ");
		email = scanner.nextLine();
		
		return new User(username, password, name, email);
	}

}
