package day5Hw1.business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import day5Hw1.business.abstracts.UserCheckService;
import day5Hw1.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	private List<User> users;

	public UserCheckManager(List<User> users) {
		this.users = users;
	}

	@Override
	public boolean passwordCheck(User user) {
		if (user.getPassword().length() >= 6)
			return true;
		else
			return false;
	}

	@Override
	public boolean emailCheck(User user) {
		
		for (User userall : users) {
			if (userall.getEmail().equals(user.getEmail())) {
				System.out.println("There is "+user.getEmail()+ " in the system.Please use diffrent email!");
				return false;}
		}

//		System.out.println("emailcheck: "+Pattern.matches("@", user.getEmail()));
		if (Pattern.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", user.getEmail()))
			return true;
		else
			return false;
	}

	@Override
	public boolean namesCheck(User user) {
		if (user.getFirstName().length() >= 2 && user.getFirstName().length() >= 2) {
			return true;
		}

		return false;
	}

}
