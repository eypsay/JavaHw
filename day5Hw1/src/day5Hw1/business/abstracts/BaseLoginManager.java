package day5Hw1.business.abstracts;

import day5Hw1.adapters.LoginService;
import day5Hw1.entities.concretes.User;

public abstract class BaseLoginManager implements LoginService{
private UserService userService;

public BaseLoginManager(UserService userService) {
	this.userService = userService;
}
@Override
public void register(User user) {
	this.userService.add(user);
}
}
