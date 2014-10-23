package es.upm.miw.pd.ecp3.solitaire.models.entities;

import java.util.List;

public class Round {

	private Integer ID;
	private String description;
	private List<Integer> cards;

	public Round(Integer iD) {
		super();
		ID = iD;
	}

	public Round(Integer iD, String description) {
		super();
		ID = iD;
		this.description = description;
	}

	public Round(Integer iD, String description, List<Integer> cards) {
		super();
		ID = iD;
		this.description = description;
		this.cards = cards;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Integer> getCards() {
		return cards;
	}

	public void setCards(List<Integer> cards) {
		this.cards = cards;
	}

}
