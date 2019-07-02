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
    public boolean inserir(Andar quarto){

        return dao.save(quarto);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Andar quarto){
        return dao.save(quarto);
    }

    @DELETE
    public boolean delete (Andar quarto){
        return dao.remove(quarto);
    }
}
