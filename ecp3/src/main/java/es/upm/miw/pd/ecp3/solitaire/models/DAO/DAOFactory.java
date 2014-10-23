package es.upm.miw.pd.ecp3.solitaire.models.DAO;

public abstract class DAOFactory {

	public abstract UserDAO getUserDAO();

	public abstract RoundDAO getRoundDAO();

}
