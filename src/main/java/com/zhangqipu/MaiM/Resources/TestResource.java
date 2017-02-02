package com.zhangqipu.MaiM.Resources;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zhangqipu.MaiM.Beans.User;

@Path("Test")
public class TestResource {
	@GET
	@Path("getString")
	@Produces(MediaType.TEXT_PLAIN)
	public String getString() {
		return "I am a string";
	}
	
	@GET
	@Path("getJson")
	@Produces(MediaType.APPLICATION_JSON)
	public User getJson() {
		User user = new User();
		user.setUserName("zhangqipu");
		user.setAge(25);
		return user;
	}
	
	@GET
	@Path("getById/{theId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getById(@PathParam("theId") String id) {
		return "The id is " + id;
	}
}
