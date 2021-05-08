package day5Hw1.business.abstracts;

import day5Hw1.entities.concretes.User;

public interface UserCheckService {
	boolean passwordCheck(User user );

	boolean emailCheck(User user);

	boolean namesCheck(User user);

}
