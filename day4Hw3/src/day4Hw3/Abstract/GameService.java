package day4Hw3.Abstract;

import day4Hw3.Entites.Game;

public interface GameService {
	public void add(Game game);

	public void update(Game game);

	public void delete(Game game);

	public void getAll(Game[] games);

}
