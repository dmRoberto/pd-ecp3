package es.upm.miw.pd.ecp3.solitaire.models.DAO.mem;

import java.util.List;

import es.upm.miw.pd.ecp3.solitaire.models.DAO.GenericDao;

public abstract class MemGenericDAO<T, ID> implements GenericDao<T, ID> {

	public abstract void create(T entity);

	public abstract T read(ID id);

	public abstract void update(T entity);

	public abstract void delete(T entity);

	public abstract void deleteById(ID id);

	public abstract List<T> findAll();

	public abstract List<T> findAll(int index, int size);

}
