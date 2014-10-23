package es.upm.miw.pd.ecp3.solitaire.models.DAO.mem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.upm.miw.pd.ecp3.solitaire.models.DAO.RoundDAO;
import es.upm.miw.pd.ecp3.solitaire.models.entities.Round;

public class MemRoundDAO extends MemGenericDAO<Round, Integer> implements
		RoundDAO<Round, Integer> {

	private Map<Integer, Round> rounds = new HashMap<Integer, Round>();

	@Override
	public void create(Round entity) {
		if (!rounds.containsKey(entity.getID())) {
			this.rounds.put(entity.getID(), entity);
		}
	}

	@Override
	public Round read(Integer id) {
		return rounds.get(id);
	}

	@Override
	public void update(Round entity) {
		if (rounds.containsKey(entity.getID())) {
			rounds.put(entity.getID(), entity);
		}
	}

	@Override
	public void delete(Round entity) {
		this.deleteById(entity.getID());
	}

	@Override
	public void deleteById(Integer id) {
		if (rounds.containsKey(id)) {
			rounds.remove(id);
		}
	}

	@Override
	public List<Round> findAll() {
		return new ArrayList(rounds.values());
	}

	@Override
	public List<Round> findAll(int index, int size) {
		List<Round> result = new ArrayList<Round>();
		Round[] arrayRounds = (Round[]) rounds.values().toArray();
		for (int i = index; i < arrayRounds.length && i < size; i++) {
			result.add(arrayRounds[i]);
		}
		return result;
	}

}
