/*LinkedList
------------------------------
contain duplicate elements.
maintains insertion order.
non synchronized.
manipulation is fast because no shifting needs to be occurred
used as list, stack or queue.
*/
import java.util.*;
public class LinkedListDemo {

   public static void main(String args[]) {
      
      LinkedList ll = new LinkedList();
      
      // add elements to the linked list
      ll.add("A");
      ll.add("U");
      ll.add("A");
      ll.addLast("M");
      ll.addFirst("G");
      ll.add(3, "T");
      
      System.out.println("Linked List Original Data: " + ll);
      System.out.println("Index of U: "+ll.indexOf("U"));
      System.out.println("Last Index of A: "+ll.lastIndexOf("A"));
      
      // remove elements from the linked list
      ll.remove("A");
      ll.remove(0);
      System.out.println("Linked List after deletion: " + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("Linked List after deleting first and last: " + ll);

      // get and set a value
      Object val = ll.get(1);
      ll.set(1, (String) val + " Changed");
      System.out.println("Linked List after change: " + ll);
      
      //Check Element Contains or Not
      System.out.println("Check Linked List Contains T: "+ll.contains("T"));
      
   }
}

/*Output
------------------------------------------------------------------------
Linked List Original Data: [G, A, U, T, A, M]
Index of U: 2
Last Index of A: 4
Linked List after deletion: [U, T, A, M]
Linked List after deleting first and last: [T, A]
Linked List after change: [T, A Changed]
Check Linked List Contains T: true

*/
