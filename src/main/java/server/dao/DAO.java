package server.dao;

import server.model.ICadastro;

public interface DAO<T extends ICadastro> {

    T findById(long id);
    T findByField(String fieldName, Object value);
    boolean remove(T entity);
    boolean save(T entity);
}
