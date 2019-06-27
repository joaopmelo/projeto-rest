package server.dao;

import server.model.ICadastro;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class JpaDAO<T extends ICadastro> implements DAO<T> {

    public EntityManager getEm() {
        return em;
    }

    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe){
        this.em = em;
        this.classe = classe;
    }

    @Override
    public T findById(long id) {
        return em.find(classe, id);
    }

    @Override
    public boolean remove(ICadastro entity) {
        em.remove(entity);
        return true;
    }

    @Override
    public boolean save(ICadastro entity) {
        if(entity.getId() > 0)
            em.persist(entity);
        else em.merge(entity);

        return true;
    }

    @Override
    public T findByField(String fieldName, Object value) {
        final String jpql = "select o from " + classe.getSimpleName() + " o " +
                " where o." + fieldName + " = :" + fieldName;
        TypedQuery<T> query = em.createQuery(jpql, classe);
        query.setParameter(fieldName, value);
        return query.getSingleResult();
    }


}
