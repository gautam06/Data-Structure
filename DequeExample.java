/*Dequeue
------------------------
-add or remove elements from both sides.
-Null elements are not allowed in the ArrayDeque.
-ArrayDeque is not thread safe, in the absence of external synchronization.
-ArrayDeque has no capacity restrictions.
-ArrayDeque is faster than LinkedList and Stack.
*/
import java.util.*;  
public class DequeExample {  
	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("Gautam");  
	    deque.offer("Sarvam");  
	    deque.add("Shyam");  
	    deque.addFirst("Ram");
	    deque.offerLast("Ganesh");  
	    System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
		System.out.println(s);  
	    }  
	    deque.pollLast(); 
	    deque.removeFirst(); 
	    System.out.println("-----------------------------------------");
	    System.out.println("After pollLast()");  
	    for(String s:deque){  
		System.out.println(s);  
	    }  
	}  
}  

/*Output
------------------------------------
After offerFirst Traversal...
Ram
Gautam
Sarvam
Shyam
Ganesh
-----------------------------------------
After pollLast()
Gautam
Sarvam
Shyam

*/
