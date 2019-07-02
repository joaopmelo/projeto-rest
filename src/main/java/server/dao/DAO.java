package server.dao;

import server.model.ICadastro;

import javax.persistence.TypedQuery;

public interface DAO<T extends ICadastro> {

    TypedQuery<T> createQuery(String jpql);
    T findById(long id);
    T findByField(String fieldName, Object value);
    boolean remove(T entity);
    boolean remove(long id);

    long save(T entity);
}
