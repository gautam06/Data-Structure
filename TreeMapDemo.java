/*LinkedHashMap
------------------------------
-contains values based on the key. 
-It implements the NavigableMap interface and extends AbstractMap class.
-It contains only unique elements.
-It cannot have null key but can have multiple null values.
-It is same as HashMap instead maintains ascending order.
*/
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class TreeMapDemo {

   public static void main(String args[]) {

       TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

       	tmap.put(1, "JAVA");
	tmap.put(23, "Python");
	tmap.put(70, "Ruby");
	tmap.put(4, "C#");
	tmap.put(2, "C++");

      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("Key: "+ mentry.getKey() + " & Value : ");
         System.out.println(mentry.getValue());
      }

   }
}

/*Output
---------------------------
Key: 1 & Value : JAVA
Key: 2 & Value : C++
Key: 4 & Value : C#
Key: 23 & Value : Python
Key: 70 & Value : Ruby

*/
