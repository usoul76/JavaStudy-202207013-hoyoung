package j19_익명클래스.role;

public class PrinterMain {

	public static void main(String[] args) {
		User user = User.builder()
				.username("junil")
				.password("1234")
				.roles("USER_ROLE, ADMIN_ROLE,MANAGER_ROLE")
				.build();
		
		User user2 = User.builder()
				.username("junil2")
				.password("1111")
				.roles("USER_ROLE")
				.build();
		
		PrincipalDetailse principalDetailse = new PrincipalDetailse(user);
		PrincipalDetailse principalDetailse2 = new PrincipalDetailse(user2);
		
		printPrincipalData(principalDetailse);
		printPrincipalData(principalDetailse2);

	}
	
	public static void printPrincipalData(PrincipalDetailse principalDetailse) {
		System.out.println("[principal 정보 출력]");
		
		System.out.println("username: " + principalDetailse.getUsername());
		System.out.println("username: " + principalDetailse.getPassword());
		
		for(GrantedAuthority grantedAuthority : principalDetailse.geAuthorities()) {
			System.out.println("권한: " + grantedAuthority.getAuthority());
		}
		System.out.println();
		
	}

}
