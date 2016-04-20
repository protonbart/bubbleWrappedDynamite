package work.manage;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * Autor: Barry Breen
 * 
 * This class will prioritize each of ID's into its own class of priority and perform operations
 * on the Priority Itself. 
 * 
 *  1) The IDs will be integers in the range of 1 to 9223372036854775807. TODO: Validate id number and type
	2) There are 4 classes of IDs, normal, priority, VIP, and management override.
	3) You can determine the class of the ID using the following method:
		(1) IDs that are evenly divisible by 3 are priority IDs.
		(2) IDs that are evenly divisible by 5 are VIP IDs.
		(3) IDs that are evenly divisible by both 3 and 5 are management override
		IDs.
		(4) IDs that are not evenly divisible by 3 or 5 are normal IDs.

	4)  IDs must be sorted in the queue according to a formula that varies based
	on their class.

 */

import java.util.Queue;

import javax.ejb.Singleton;
import javax.ejb.Stateful;

public class QueuePriorityAssignment {
	
	Queue<Map<Integer,Integer>> queue;
	
	//constructor to create the queue
	public QueuePriorityAssignment(){
		
		//Queue will store the work request order as id (Integer) and time (Integer).
		//Time is in a long digit format e.g. 16042016152100
		queue = new LinkedList<Map<Integer,Integer>>();
	}
	
	//TODO: Unit Testing required here for values entered!
	public boolean addToQueue(Integer id, Integer time){
		
		try{
		Map<Integer, Integer> newWorkOrder = new HashMap<Integer, Integer>();
		newWorkOrder.put(id, time);
		queue.add(newWorkOrder);
		
		if(!queue.isEmpty()){
			return true;
		}else{
			return false;
		}
		
		}catch(Exception e){
			return false;
		}
		
	}	
	
	public int getIDfromQueue(int id){
		return id;
		
		//iterate through linked list of hash maps for
		//id number and return the id and time it was added
		
	}
	
	public String getListIDs(){
	
		if(!queue.isEmpty()){
			
			return queue.toString();
		}else{
			return "There are no ID's in the Queue";
		}
		
	}
	
	public boolean removeFromQueue(int ID){
		return true;
	}	
	
	public boolean removeLastIDFromQueue(){
		return true;
		
	}
	
//	public EnumIDClass getPriorityClassFromID(int ID){
//		//Determine the class of each ID by a modulous formula in respect 3) above.
//		EnumIDClass idClass = EnumIDClass.Normal;
//		
//		//ID is evenly divisible by 3 are Priority ID's
//		if(ID % 3 == 0 && ID % 5 != 0){
//			idClass = EnumIDClass.Priority;
//			
//		//ID is evenly divisible by 5 are VIP ID's
//		}else if(ID % 5 == 0 && ID % 3 != 0){
//			idClass = EnumIDClass.VIP;
//			
//		//ID is evenly divisible by 3 and 5 are Management Override ID's
//		}else if(ID % 5 == 0 && ID % 3 == 0){
//			idClass = EnumIDClass.Management_Override;
//			
//		//ID's not evenly divisible by 3 or 5 are normal ID's
//		}else if(ID % 5 != 0 && ID % 3 != 0){
//			idClass =  EnumIDClass.Normal;
//		}
//		
//		return idClass;
//		
//	}
	


}
