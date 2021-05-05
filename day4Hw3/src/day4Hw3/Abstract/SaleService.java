package day4Hw3.Abstract;

import day4Hw3.Entites.Campaign;
import day4Hw3.Entites.Game;
import day4Hw3.Entites.Player;
import day4Hw3.Entites.Sale;

public interface SaleService {
	public void add(Sale sale);

	public void update(Sale sale);

	public void delete(Sale sale);

	public void getAll(Sale[] sales);

	public void sell(Sale sale, Game game, Player player, Campaign campaign);
}
