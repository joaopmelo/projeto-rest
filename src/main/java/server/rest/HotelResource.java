package server.rest;

import server.dao.HotelDao;
import server.model.Hotel;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hotel")
@Transactional
public class HotelResource {

    @Inject
    private HotelDao daoHotel;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Hotel findById(@PathParam("id")long id){

        return daoHotel.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean inserir(Hotel hotel){

        return daoHotel.save(hotel);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Hotel hotel){
        return daoHotel.save(hotel);
    }

    @DELETE
    public boolean delete (Hotel hotel){
        return daoHotel.remove(hotel);
    }

}
