package day5Hw1.adapters;

import day5Hw1.business.abstracts.BaseLoginManager;
import day5Hw1.business.abstracts.UserService;
import day5Hw1.entities.concretes.User;
import day5Hw1.googleLoginService.GoogleLoginManager;

public class GoogleLoginManagerAdapter extends BaseLoginManager {

	public GoogleLoginManagerAdapter(UserService userService) {
		super(userService);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(User user) {
		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		if(googleLoginManager.login(user.getEmail())) {
			super.register(user);
			System.out.println("Login success with Google account");
		}else System.out.println("Invalid Login with Google account");

	}

}
