package services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Todo;

@Path("/todosimple")
public class TodoResourceSimple {
	@GET
	@Produces({MediaType.TEXT_XML})
	public Todo getHTML(){
		Todo todo = new Todo();
		todo.setSummary("This is my first todo");
		todo.setDescription("this is my first todo desc");
		return todo;
	}

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Todo getXML(){
		Todo todo = new Todo();
		todo.setSummary("This is my first todo");
		todo.setDescription("this is my first todo desc");
		return todo;
	}
	
}
