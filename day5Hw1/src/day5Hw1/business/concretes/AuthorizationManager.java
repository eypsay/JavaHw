package day5Hw1.business.concretes;

import day5Hw1.adapters.LoginService;
import day5Hw1.business.abstracts.AuthorizationService;
import day5Hw1.entities.concretes.User;

public class AuthorizationManager implements AuthorizationService{
private User user;
private LoginService loginService;


	public AuthorizationManager(User user, LoginService loginService) {
	this.user = user;
	this.loginService = loginService;
}

	@Override
	public void login(String email, String pasword,User user) {
		if (user.getEmail().equals(email) &&user.getPassword().equals(pasword)) {
			System.out.println(user.getEmail()+" Login Success");
			
		}else System.out.println("Login Invalid for "+user.getEmail());
		
	}

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		loginService.register(user);
	}

}
