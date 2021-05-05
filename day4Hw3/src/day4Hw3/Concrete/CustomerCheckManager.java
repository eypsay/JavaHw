package day4Hw3.Concrete;

import day4Hw3.Abstract.PlayerCheckService;
import day4Hw3.Entites.Player;

public class CustomerCheckManager implements PlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		// my fake control method

		return true;
	}
}
