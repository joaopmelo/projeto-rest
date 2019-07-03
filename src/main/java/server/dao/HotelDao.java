package server.dao;

import server.model.Hotel;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HotelDao extends JpaDAO<Hotel> {


    public HotelDao(EntityManager em){
        super(em, Hotel.class);

    }

    public List<Hotel> findByCidade(long cidade_id) {
        final String jpql = "select h from  Hotel  h where h.bairro.cidade.id = :cidadeId";
        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
        query.setParameter("cidadeId", cidade_id);
        return query.getResultList();
    }

    public List<Hotel> findByBairro(long bairro_id) {
        final String jpql = "select h from  Hotel  h where h.bairro.id = :bairroId";
        TypedQuery<Hotel> query = getEm().createQuery(jpql, Hotel.class);
        query.setParameter("bairroId", bairro_id);
        return query.getResultList();
    }


}
