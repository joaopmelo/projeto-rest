package server.rest;

import server.dao.DAO;

import server.model.ReservaQuarto;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/reserva-quarto")
@Transactional
public class ReservaQuartoResource {

    @Inject
    private DAO<ReservaQuarto> dao;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ReservaQuarto findById(@PathParam("id")long id){

        return dao.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean inserir(ReservaQuarto reserva){

        return dao.save(reserva);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(ReservaQuarto reserva){
        return dao.save(reserva);
    }

    @DELETE
    public boolean delete (ReservaQuarto reserva){
        return dao.remove(reserva);
    }
}
