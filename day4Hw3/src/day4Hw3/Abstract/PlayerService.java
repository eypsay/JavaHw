package day4Hw3.Abstract;

import day4Hw3.Entites.Player;

public interface PlayerService extends BaseService{
	public void add(Player player);

	public void update(Player player);

	public void delete(Player player);

	public void getAll(Player[] players);
	public void searchPlayer(Player[] players,int playerId);
}
