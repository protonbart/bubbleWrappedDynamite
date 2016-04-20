package work.manage;
/**
 * 
 */


import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

/**
 * @author Barry Breen
 * 
 * This registers Methods for HTTP GET and PUT REQUESTS and handles
 * different request types
 * This will take in an id as a parameter. 
 *
 */

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/Endpoints")
public class HTTPMethodRegisters {
	
	QueuePriorityAssignment queuePriorityAssignment;
	
	//constructor to initialize the queue
	public HTTPMethodRegisters(){
		queuePriorityAssignment = new QueuePriorityAssignment();
		
	}
	/*
	 * 

(3) An endpoint for getting the list of IDs in the queue. This endpoint should
return a list of IDs sorted from highest ranked to lowest.
(4) An endpoint for removing a specic ID from the queue. This endpoint
should accept a single parameter, the ID to remove.
(5) An endpoint to get the position of a specic ID in the queue. This endpoint
should accept one parameter, the ID to get the position of. It should return
the position of the ID in the queue indexed from 0.
(6) An endpoint to get the average wait time. This endpoint should accept a
single parameter, the current time, and should return the average (mean)
number of seconds that each ID has been waiting in the queue.
	 */
	

	  @Path("/Test/") 
	  @GET
	  @Consumes(MediaType.WILDCARD)
	  @Produces(MediaType.WILDCARD)
	  public Response testWebservice() {
	    String msg= "Hi, Your webservice is working, boo-ya!";
	    return Response.ok(msg).build();
	  }
	  
	  /* Method Name: Enqueue
	   * Parameter: integer id
	   * returns: Response
	   * (1) An endpoint for adding a ID to queue (enqueue). This endpoint should
	  accept two parameters, the ID to enqueue and the time at which the ID
	  was added to the queue.
	  */
	  @Path("/Enqueue/")
	  @POST
	  @Consumes(MediaType.WILDCARD)
	  @Produces(MediaType.WILDCARD)
	  public Response enqueue(@QueryParam("id") int id, @QueryParam("time") int time){

		  try{

			  Boolean success = queuePriorityAssignment.addToQueue(id,time);
			  if (success){
				  return Response.status(Response.Status.CREATED).entity(queuePriorityAssignment.getListIDs()).build();
			  }else{
				  return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
			  }
		  }catch(Exception e){
			  return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		  }
	  }
	 
	  
	  /* Method Name: Dequeue
	   * Parameter: integer id
	   * returns: Response
	   * (1) An endpoint for adding a ID to queue (enqueue). This endpoint should
	  accept two parameters, the ID to enqueue and the time at which the ID
	  was added to the queue.
	  */

	  /* Method Name: Dequeue
	   * @param integer topId
	   * @return - 
	   * Parameter: none
	   * Returns: integer topId
	   * (2) An endpoint for getting the top ID from the queue and removing it (de-
			  queue). This endpoint should return the highest ranked ID and the time
			  it was entered into the queue..
	  */
	  @Path("/Dequeue/{id}")
	  @DELETE
	  @Produces(MediaType.TEXT_PLAIN)
	  public Response dequeue(@PathParam("id") int id){
		 String methodName="dequeue";
		 String msg= "Work request was successfully deleted";
		 //System.out.println(methodname +":" dateTime() + msg);
		 return Response.status(Response.Status.OK).entity(id).build();
	  }
	  
	  
	  /* Method Name: ListID's
	   * @param none
	   * @return - string
	   * 
	   * (3) An endpoint for getting the list of IDs in the queue. This endpoint should
			return a list of IDs sorted from highest ranked to lowest.
	  */
	  @Path("/List/")
	  @GET
	  @Consumes(MediaType.WILDCARD)
	  @Produces(MediaType.WILDCARD)
	  public Response list(){
		  String ids = queuePriorityAssignment.getListIDs();
		  return Response.status(Response.Status.OK).entity(ids).build();
		
	  }
	 


}
