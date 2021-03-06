package es.upm.miw.pd.ecp3.solitaire.models.DAO.mem;

import es.upm.miw.pd.ecp3.solitaire.models.DAO.DAOFactory;
import es.upm.miw.pd.ecp3.solitaire.models.DAO.RoundDAO;
import es.upm.miw.pd.ecp3.solitaire.models.DAO.UserDAO;

public class MemDAOFactory extends DAOFactory {

	private static MemDAOFactory instance;

	private MemDAOFactory() {

	}

	public static MemDAOFactory getInstance() {
		if (instance == null) {
			return new MemDAOFactory();
		} else {
			return instance;
		}
	}

	@Override
	public UserDAO getUserDAO() {
		return new MemUserDAO();
	}

	@Override
	public RoundDAO getRoundDAO() {
		return new MemRoundDAO();
	}

}
