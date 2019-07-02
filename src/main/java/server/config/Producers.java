package server.config;

import server.dao.DAO;
import server.dao.JpaDAO;
import server.model.ICadastro;
import server.dao.HotelDao;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public class Producers {

    @Produces
    @PersistenceContext
    private EntityManager em;

    @Produces
    @SuppressWarnings("unchecked")
    public <T extends ICadastro> DAO<T> getDao(InjectionPoint ip){
        ParameterizedType t = (ParameterizedType) ip.getType();
        Class classe = (Class) t.getActualTypeArguments()[0];

        return new JpaDAO<>(em, classe);
    }

    @Produces
    //@SuppressWarnings("unchecked")
    public HotelDao getHotelDao(InjectionPoint ip){
        return new HotelDao(em);
    }
}
