package day4Hw3.Concrete;

import day4Hw3.Abstract.PlayerService;
import day4Hw3.Entites.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void add(Player player) {
		System.out.println(player.getFirstName() + " added in the system.");

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
