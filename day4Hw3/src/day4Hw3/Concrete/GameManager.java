package day4Hw3.Concrete;

import day4Hw3.Abstract.GameService;
import day4Hw3.Entites.Game;
import day4Hw3.Entites.Sale;
import day4Hw3.Entites.Player;

public class GameManager implements GameService {
	private Player _player;
	private Sale _sale;

	public GameManager() {
	}

	public GameManager(Player _player, Sale _sale) {
		this._player = _player;
		this._sale = _sale;
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " added in the system");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " updated in the system");

	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " deleted in the system");
	}

	@Override
	public void getAll(Game[] games) {
		System.out.println();
		System.out.println("*****ALL GAMES*****");
		for (Game game : games) {
			System.out.println(
					game.getName() + " " + game.getDescription() + " " + game.getPrice() + " " + game.getStock());
		}
		System.out.println();

	}

}
