package org.example.web.resource;

import org.example.web.model.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/list")
public class ListResource
{
    private static List<Service> list = new ArrayList<>();

    static
    {
        list.add(new Service("xlsxToCsv"));
        list.add(new Service("analytics"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Service> getAll()
    {
        return list;
    }

//    @GET
//    @Path("/{id}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Example getExampleById(@PathParam("id") int id)
//    {
//        return examples.get(id - 1);
//    }
//
//    @PUT
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Example putExampleById(@PathParam("id") int id, Example updatedExample)
//    {
//        return examples.set(id - 1, updatedExample);
//    }
//
//    @POST
//    @Path("/post")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Example newExample(Example newExample)
//    {
//        examples.add(newExample);
//        return newExample;
//    }
//
//    @DELETE
//    @Path("/{id}")
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Example deleteExampleById(@PathParam("id") int id)
//    {
//        return examples.remove(id - 1);
//    }
}