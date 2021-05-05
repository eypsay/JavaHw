package day4Hw3.Concrete;

import day4Hw3.Abstract.CampaignService;
import day4Hw3.Abstract.SaleService;
import day4Hw3.Entites.Campaign;
import day4Hw3.Entites.Game;
import day4Hw3.Entites.Sale;
import day4Hw3.Entites.Player;

public class SaleManager implements SaleService {

	public SaleManager() {
	}

	@Override
	public void getAll(Sale[] sales) {
		System.out.println();
		System.out.println("*****PLAYER & GAMES*****");
		for (Sale sale : sales) {
			System.out.println(sale.getId() + " " + sale.getPlayerId() + " " + sale.getGameId());
		}
		System.out.println();

	}

	@Override
	public void add(Sale sale) {

		System.out.println("Sale data added!!!");

	}

	@Override
	public void update(Sale sale) {
		System.out.println("Sale data updated!!!");
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Sale data updated!!!");

	}

	@Override
	public void sell(Sale sale, Game game, Player player, Campaign campaign) {
		double newPrice = 0;
		System.out.println("*****SALE PROCESSES*****");

		if (campaign.getIsValid()) {
			newPrice = (game.getPrice() - (game.getPrice() * campaign.getDiscountValue() / 100));
			System.out.println(game.getName() + " bougth " + newPrice + " TL with **" + campaign.getDescription()
					+ "** camping by " + player.getFirstName());
		} else {
			System.out.println(game.getName() + " bougth " + game.getPrice() + " TL by " + player.getFirstName());
		}
		int stock = game.getStock();
		game.setStock(--stock);
		System.out.println("New stock value " + game.getStock() + " for " + game.getName());
		sale.setGameId(game.getId());
		sale.setPlayerId(player.getId());

	}

}
