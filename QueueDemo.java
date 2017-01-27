/*
Priority Queue
--------------------------------
The PriorityQueue class provides the facility of using queue. 
But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
*/
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
class QueueDemo{
	public static void main(String args[]){
		Queue<String> q = new PriorityQueue<>();
		
		q.add("Gautam");
		q.add("Sarvam");
		q.add("Chaital");
		q.add("Karan");
		 Iterator<String> itr = q.iterator();
		 
		 while(itr.hasNext()){
		 	System.out.println(itr.next());
		 }
		 
		 //removing record
		 System.out.println("Removing "+q.peek()+" from queue");
		 q.remove();
		 
		 System.out.println("After removing one record");
		 for(Object obj:q){
		 	System.out.println((String)obj);
		 }
		 
	}
}

/*Output
----------------------
Chaital
Karan
Gautam
Sarvam
Removing Chaital from queue
After removing one record
Gautam
Karan
Sarvam

*/
