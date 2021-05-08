package day5Hw1.entities.concretes;

import day5Hw1.entities.abstracts.Entity;

public class UserActivation implements Entity{
private int id;
private int userId;
private String activationCode;
private boolean isActivated;

public UserActivation(int id) {
	this.id = id;
}

public UserActivation(int id, int userId, String activationCode, boolean isActivated) {
	this.id = id;
	this.userId = userId;
	this.activationCode = activationCode;
	this.isActivated = isActivated;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getActivationCode() {
	return activationCode;
}

public void setActivationCode(String activationCode) {
	this.activationCode = activationCode;
}

public boolean isActivated() {
	return isActivated;
}

public void setActivated(boolean isActivated) {
	this.isActivated = isActivated;
}



}
