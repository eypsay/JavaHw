package day5Hw1.business.concretes;

import java.util.List;

import day5Hw1.business.abstracts.MailService;
import day5Hw1.business.abstracts.UserActivationService;
import day5Hw1.business.abstracts.UserCheckService;
import day5Hw1.business.abstracts.UserService;
import day5Hw1.entities.concretes.User;

public class UserManager implements UserService {
	private UserCheckService userCheckService;
	private UserActivationService userActivationService;
	private MailService mailService;
	private List<User> users;

	public UserManager(UserCheckService userCheckService, UserActivationService userActivationService,
			MailService mailService, List<User> users) {
		this.userCheckService = userCheckService;
		this.users = users;
		this.userActivationService = userActivationService;
		this.mailService = mailService;
	}

	@Override
	public void add(User user) {

		if (userCheckService.emailCheck(user) && userCheckService.passwordCheck(user)
				&& userCheckService.namesCheck(user)) {
			System.out.println(user.getFirstName() + " added successfully.");
			users.add(user);
			userActivationService.add(user);
			mailService.sendMail(user.getEmail(), "Activasyon codu gönderildi");
		} else {
			System.out.println(user.getFirstName() + " User's Info is not valid!!!");
		}
		System.out.println("----------------------------");
	}

	@Override
	public void getAll(List<User> users) {
		System.out.println("\n*****ALL USERS IN THE SYSTEM*****");

		for (User user : users) {
			System.out.println(user.getEmail());
		}

	}

}
