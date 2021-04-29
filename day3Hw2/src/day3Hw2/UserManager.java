package day3Hw2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " Sisteme Eklendi!");
	}

	public void multipleAdd(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
