package server.rest;

import server.dao.DAO;
import server.model.Andar;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/andar")
@Transactional
public class AndarResource {

    @Inject
    private DAO<Andar> dao;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Andar findById(@PathParam("id")long id){

        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public long inserir(Andar andar){

        return dao.save(andar);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Andar andar){
        return dao.save(andar) > 0;
    }

    @DELETE
    public boolean delete (Andar andar){
        return dao.remove(andar);
    }
}
