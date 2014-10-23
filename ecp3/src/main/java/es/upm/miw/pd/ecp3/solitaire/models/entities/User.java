package es.upm.miw.pd.ecp3.solitaire.models.entities;

public class User {

	Integer ID;
	String name;
	String password;

	public User(Integer iD) {
		super();
		ID = iD;
	}

	public User(Integer iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public User(Integer iD, String name, String password) {
		super();
		ID = iD;
		this.name = name;
		this.password = password;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
