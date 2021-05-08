package day5Hw1;

import java.util.ArrayList;
import java.util.List;

import day5Hw1.adapters.GoogleLoginManagerAdapter;
import day5Hw1.adapters.LoginService;
import day5Hw1.business.abstracts.AuthorizationService;
import day5Hw1.business.abstracts.UserActivationService;
import day5Hw1.business.concretes.AuthorizationManager;
import day5Hw1.business.concretes.MailManager;
import day5Hw1.business.concretes.UserActivationManager;
import day5Hw1.business.concretes.UserCheckManager;
import day5Hw1.business.concretes.UserManager;
import day5Hw1.entities.concretes.User;
import day5Hw1.entities.concretes.UserActivation;
import day5Hw1.googleLoginService.GoogleLoginManager;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "eyp", "say", "eypsay@yahoo.com", "123456");
		User user2 = new User(2, "ali", "us", "ali.yahoo.com", "456");
		User user3 = new User(3, "veli", "zeki", "veliyahoo.com", "abc123");
		User user4 = new User(4, "deli", "var", "deli@yahoo.com", "123123123");
		User user5 = new User(5, "eyp", "say", "deli@yahoo.com", "123456");
		User user6 = new User(5, "eee", "sss", "eypsay@gmail.com", "987654");
		// User[] users = { user1, user2, user3, user4, user5 };
		List<User> users = new ArrayList<User>();

		UserActivation userActivation = new UserActivation(1);
		UserActivationService activationService = new UserActivationManager(userActivation);

		UserManager userManager = new UserManager(new UserCheckManager(users),
				new UserActivationManager(userActivation), new MailManager(), users);
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		userManager.add(user5);
		userManager.add(user6);

		activationService.check("7170dea5-6c7b-4572-b043-06045af88f09", user1);
		

		AuthorizationService authorizationService = new AuthorizationManager(user1,
				new GoogleLoginManagerAdapter(userManager));
		
		authorizationService.login("eypsay@gmail.com", "987654", user6);
		
		userManager.getAll(users);
	}

}
