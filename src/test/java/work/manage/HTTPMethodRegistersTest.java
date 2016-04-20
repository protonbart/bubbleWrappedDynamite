//package work.manage;
///**
// * 
// */
//
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
//import org.mockito.Mockito;
//
///**
// * @author Barry Breen
// * 
// *
// */
//
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
//import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import static org.mockito.Matchers.anyString;
//import static org.mockito.Matchers.mock;
//import static org.mockito.Matchers.when;
//
//public class HTTPMethodRegistersTest{
//	
//	private HTTPMethodRegisters httpMethodRegisters;
//	private QueuePriorityAssignment queuePriorityMock;
//	
//	@Before
//	public void setUp() {
//		httpMethodRegisters = new HTTPMethodRegisters();
//		queuePriorityMock = mock(QueuePriorityAssignment.class);
//	}
//	
//	@After
//	public void teardown(){
//		
//	}
//	
////	@Test
////	public testAddition(){
////		Integer num1 = 1;
////		Integer num2 = 2;
////		 Integer total = httpMethodRegisters.addition(num1,num2);
////
////		 assertEquals(total, 3);	
////	}
//	
//	  @Test
//	  public testEnqueue(){
//		  Integer id = 3;
//		 
//		 when(queuePriorityMock.AddToQueue(anyInteger()).thenReturn(true);
//		 
//		 Response testResponse = httpMethodRegisters.enqueue(id);
//
//		 assertEquals(testResponse.getStatus(), 201);		 
//				 
//	  }
//	  
//	  @Test
//	  public testEnqueueFails(){
//		  Integer id = 3;
//		 
//		 when(queuePriorityMock.AddToQueue(anyInteger()).thenReturn(false);
//		 
//		 Response testResponse = httpMethodRegisters.enqueue(id);
//		 
//		 assertEquals(testResponse.getStatus(), 500);
//				 
//	  }
//
//	  /* Method Name: Dequeue
//	   * @param integer topId
//	   * @return - 
//	   * Parameter: none
//	   * Returns: integer topId
//	   * (2) An endpoint for getting the top ID from the queue and removing it (de-
//			  queue). This endpoint should return the highest ranked ID and the time
//			  it was entered into the queue..
//	  */
//	  @Path("/Dequeue/{id}")
//	  @DELETE
//	  @Produces(MediaType.TEXT_PLAIN)
//	  public Response dequeue(@PathParam("id") int id){
//		 String methodName="dequeue";
//		 String msg= "Work request was successfully deleted";
//		 //System.out.println(methodname +":" dateTime() + msg);
//		 return Response.status(Response.Status.OK).entity(id).build();
//	  }
//
//
//}
