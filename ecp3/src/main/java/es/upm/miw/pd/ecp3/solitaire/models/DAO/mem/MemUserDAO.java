package es.upm.miw.pd.ecp3.solitaire.models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.miw.pd.ecp3.solitaire.models.DAO.UserDAO;
import es.upm.miw.pd.ecp3.solitaire.models.entities.User;

public class MemUserDAO extends MemGenericDAO<User, Integer> implements
		UserDAO<User, Integer> {

	private Map<Integer, User> users = new HashMap<Integer, User>();

	@Override
	public void create(User entity) {
		if (!users.containsKey(entity.getID())) {
			this.users.put(entity.getID(), entity);
		}
	}

	@Override
	public User read(Integer id) {
		return users.get(id);
	}

	@Override
	public void update(User entity) {
		if (users.containsKey(entity.getID())) {
			users.put(entity.getID(), entity);
		}
	}

	@Override
	public void delete(User entity) {
		this.deleteById(entity.getID());
	}

	@Override
	public void deleteById(Integer id) {
		if (users.containsKey(id)) {
			users.remove(id);
		}
	}

	@Override
	public List<User> findAll() {
		return new ArrayList(users.values());
	}

	@Override
	public List<User> findAll(int index, int size) {
		List<User> result = new ArrayList<User>();
		User[] arrayUsers = (User[]) users.values().toArray();
		for (int i = index; i < arrayUsers.length && i < size; i++) {
			result.add(arrayUsers[i]);
		}
		return result;
	}

}
