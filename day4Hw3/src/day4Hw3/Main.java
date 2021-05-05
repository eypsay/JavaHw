package day4Hw3;

import java.time.LocalDate;
import java.util.Date;

import day4Hw3.Adapter.MernisServiceAdapter;
import day4Hw3.Concrete.CampaignManager;
import day4Hw3.Concrete.GameManager;
import day4Hw3.Concrete.SaleManager;
import day4Hw3.Concrete.PlayerManager;
import day4Hw3.Entites.Campaign;
import day4Hw3.Entites.Game;
import day4Hw3.Entites.Sale;
import day4Hw3.Entites.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player(1, "eyp", "say", "e@e.com", LocalDate.of(1999, 2, 12), "1");
		Player player2 = new Player();
		player2.setEmail("ali@a.com");
		player2.setFirstName("ali");
		player2.setLastName("veli");
		player2.setId(2);
		player2.setBirthDate(LocalDate.of(2000, 12, 29));
		Player player3 = new Player(3, "eyp", "say", "deneme@e.com", LocalDate.of(1998, 12, 12), "41172028790");
		Player[] players = { player1, player2, player3 };

		Game game1 = new Game(1, "FIFA", "Football Game", 10, 5);
		Game game2 = new Game(2, "Age of Empires", "Strategy", 20, 10);
		Game[] games = { game1, game2 };

		Sale member1 = new Sale(1);
		Sale member2 = new Sale(2);
		Sale[] members = { member1, member2 };

		Campaign campaign1 = new Campaign(1, "HappySpring", "For spring big discount", 15, false);
		Campaign campaign2 = new Campaign(1, "myStudent", "For studnets big discount", 20, true);
		Campaign[] campaigns = { campaign1, campaign2 };
		///// MANAGER PARTS
		PlayerManager playerManager = new PlayerManager();
		// playerManager.add(player2);
		playerManager.getAll(players);
		playerManager.searchPlayer(players, 2);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);

		GameManager gameManager1 = new GameManager(player2, member1);
		// gameManager1.sell(game2);
		gameManager1.getAll(games);

		SaleManager saleManager = new SaleManager();
		saleManager.sell(member1, game2, player1, campaign2);
		saleManager.sell(member2, game2, player2, campaign1);
		saleManager.getAll(members);

		/// MERNIS IMPLMENTED

		PlayerManager playerManager2 = new PlayerManager(new MernisServiceAdapter());
		playerManager2.add(player3);
	}

}
