package server.rest;

import server.dao.HotelDao;
import server.model.Hotel;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

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

    @GET
    @Path("/cidade/{cidade_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hotel> findByCidade(@PathParam("cidade_id") long cidade_id){

        List<Hotel> hoteis = daoHotel.findByCidade(cidade_id);
        for (Hotel h : hoteis) {
            h.setAndares(null);
        }
        return hoteis;
    }

    @GET
    @Path("/bairro/{bairro_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hotel> findByBairro(@PathParam("bairro_id") long bairro_id){

        List<Hotel> hoteis = daoHotel.findByCidade(bairro_id);
        for (Hotel h : hoteis) {
            h.setAndares(null);
        }
        return hoteis;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public long inserir(Hotel hotel){

        return daoHotel.save(hotel);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean update(Hotel hotel){
        return daoHotel.save(hotel) > 0;
    }

    @DELETE
    public boolean delete (Hotel hotel){
        return daoHotel.remove(hotel);
    }

}
