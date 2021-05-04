package day4Hw3.Entites;

import day4Hw3.Abstract.Entity;

public class Campaign implements Entity {
	private int id;
	private String name;
	private String description;
	private int discountValue;
	private boolean isValid;

	public Campaign() {
	}

	public Campaign(int id, String name, String description, int discountValue,boolean isValid) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountValue = discountValue;
		this.isValid=isValid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public boolean getIsValid() {
		return isValid;
	}

	public void setIsValid(boolean isValid) {
		this.isValid = isValid;
	}

}
