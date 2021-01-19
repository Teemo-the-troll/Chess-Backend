package API.User;

import resources.datas.User;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("user")
public class UManagement {

    @Inject
    LoggedUser l;

    @GET
    public Response getUser() {
        return Response.ok(l.getLoggedUser()).build();
    }

    @POST
    public Response createUser(User u) {
        if (true) {   // TODO implement
            return Response.status(201, "creation successful").build();
        }
        return Response.status(409, "user with this name already exists").build();
    }

    @DELETE
    public Response deleteUser(User u) {
        if (true) { //TODO implement
            return Response.status(201, "user deleted").build();
        }
        return Response.status(402, "deleting user failed").build();
    }

    @PUT
    public Response changePassword(User u) {
        if (true) { //TODO implement
            return Response.status(201, "password changed").build();
        }
        return Response.status(402, "changing password failed").build();
    }

}
