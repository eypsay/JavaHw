package day4Hw3.Entites;

import day4Hw3.Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private int playerId;
	private int gameId;
	public Sale() {
	}
	public Sale(int id) {
		this.id = id;
	}
	public Sale(int id, int playerId, int gameId) {
		this.id = id;
		this.playerId = playerId;
		this.gameId = gameId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	

}
