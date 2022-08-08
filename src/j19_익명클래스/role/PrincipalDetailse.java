package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrincipalDetailse {
	
	@NonNull
	private User user;
	
	public Collection<? extends GrantedAuthority> geAuthorities(){
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		
		return authorities;
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	
	public String getPassword() {
		return user.getPassword();
	}
	
//	public static void main(String[] args) {
//
//		String strRoles = "USER_ROLE, ADMIN_ROLE,MANAGER_ROLE";
//		String[] roleArray = strRoles.replaceAll(" ", "").split(",");
//		
//		List<String> roles = new ArrayList<String>();
//		roles.addAll(Arrays.asList(roleArray));
//		
//		System.out.println(roles);
//		
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> geRoles(List<String> roles) {
//				List<String> roleList =  new ArrayList<String>();
//				roles.addAll(roles);
//				return roles;
//			}
//		}.geRoles(roles);
//		
//		System.out.println(roles);
//
//	}

}
