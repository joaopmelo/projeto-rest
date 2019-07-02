package server.rest;


import server.dao.DAO;
import server.model.Quarto;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/quarto")
@Transactional
public class QuartoResource {

    @Inject
    private DAO<Quarto> dao;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Quarto findById(@PathParam("id")long id){

        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean inserir(Quarto quarto){

        return dao.save(quarto);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Quarto quarto){
        return dao.save(quarto);
    }

    @DELETE
    public boolean delete (Quarto quarto){
        return dao.remove(quarto);
    }

}
