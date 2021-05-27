package karafcxf.rest;


import karafcxf.entity.PersonEntity;
import karafcxf.service.service.PersonService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("/manage")


public class PersonRest {
    private PersonService personService;

    public PersonRest(PersonService personService){
        this.personService=personService;
    }
    @GET
    @Path("getList")
    public List<PersonEntity> getList(){
        return personService.getList();
    }

    @GET
    @Path("get/{id}")
    public PersonEntity getPerson(@PathParam("id") Integer id){
        return personService.getPerson(id);
    }
    @POST
    @Path("add")
    public void addPerson(PersonEntity personEntity){
        personService.addPerson(personEntity);
    }
    @PUT
    @Path("update/{id}")
    public void updatePerson(@PathParam("id") Integer id, PersonEntity personEntity){
        personService.updatePerson(id, personEntity);
    }
    @DELETE
    @Path("delete/{id}")
    public void delPerson(@PathParam("id") Integer id){
        personService.delPerson(id);
    }
}
