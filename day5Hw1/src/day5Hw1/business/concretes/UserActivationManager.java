package day5Hw1.business.concretes;

import java.util.UUID;

import day5Hw1.business.abstracts.UserActivationService;
import day5Hw1.entities.concretes.User;
import day5Hw1.entities.concretes.UserActivation;

public class UserActivationManager implements UserActivationService {
//	private User user;
	private UserActivation userActivation;

	/*
	 * public UserActivationManager(UserActivation userActivation, User user) {
	 * this.userActivation = userActivation; this.user = user; }
	 */
	public UserActivationManager(UserActivation userActivation) {
		this.userActivation = userActivation;
	}

	@Override
	public void add(User user) {
		///TEST AMACLI UUID
		//5c6588eb-5a16-4b96-99ac-7f7e94cc0f52
		//bce22818-2ddf-4b22-a2c5-616531ef6c82
	String	activationCode="7170dea5-6c7b-4572-b043-06045af88f09";
		
		//UUID uuid = UUID.randomUUID();
		//String activationCode = uuid.toString();
		userActivation.setUserId(user.getId());
		userActivation.setActivationCode(activationCode);
		userActivation.setActivated(false);
		System.out.println("ACTIVATON ");
		System.out.println(userActivation.getUserId() + " -> " + userActivation.getActivationCode());
	}

	@Override
	public void check(String activationCode,User user) {
		// UserActivation userActivation = this.userActivation.get(u ->
		// u.getActivationCode() == activationCode);type name = new type();
		if (activationCode == userActivation.getActivationCode())

		{
			System.out.println("Aktivasyon kodu doðru");
			activate(user);
		} else
			System.out.println("Ativasyon code hatasý!!!");
	}

	@Override
	public void activate(User user) {
		userActivation.setUserId(user.getId());
		userActivation.setActivated(true);
		System.out.println(user.getEmail()+ " activated");
	}

}
