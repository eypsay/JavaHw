package day4Hw3.Concrete;

import day4Hw3.Abstract.PlayerCheckService;
import day4Hw3.Abstract.PlayerService;
import day4Hw3.Entites.Player;

public class PlayerManager implements PlayerService {

	private PlayerCheckService customerCheckService;

	public PlayerManager() {
	}

	public PlayerManager(PlayerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Player player) {

		if (customerCheckService.checkIfRealPerson(player))

		{
			System.out.println("Person is Valid!!!");
			System.out.println(player.getFirstName() + " added in the system.");

		} else {
			System.out.println("Not a valid Person!!! Try again a valid info");
		}

	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName() + " updated in the system.");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName() + "deleted in system.");

	}

	@Override
	public void getAll(Player[] players) {
		System.out.println();
		System.out.println("*****ALL PLAYERS*****");
		for (Player player : players) {
			System.out.println(player.getId() + " " + player.getEmail() + " " + player.getFirstName() + " "
					+ player.getLastName() + " " + player.getBirthDate());
		}
		System.out.println("---------------------");

	}

	@Override
	public void searchPlayer(Player[] players, int playerId) {
		boolean found = false;
		for (Player player : players) {
			if (player.getId() == playerId) {
				System.out.println("FOUND: " + player.getEmail() + " " + player.getFirstName() + " "
						+ player.getLastName() + " " + player.getBirthDate());
				found = true;
				break;
			}
		}
		if (!found)
			System.out.println("NOT FOUND");
	}

}
